package controllers;

import models.products.Product;
import models.shopping.OrderItem;
import models.shopping.ShopOrder;
import models.users.Customer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import play.mvc.Controller;

import java.io.File;
import java.util.*;

public class Statistics extends Controller {

    public static String medianPrice() {
        List<Product> a = Product.findAll();
        List<String> mc = new ArrayList<String>(a.size());
        for (int i = 0; i < mc.size(); i++) {
            mc.add(a.get(i).getPlatform().getName());
        }
        System.out.println(mostCommonElement(mc));

        String result = mostCommonElement(mc);

        return result;
    }


    public static double medianAmountSpentfr() {

        List<ShopOrder> all = ShopOrder.findAll();
        ArrayList<Double> amountsSpent = new ArrayList<>();

        for (int i = 0; i < all.size(); i++) {
            amountsSpent.add(all.get(i).getOrderTotal());
        }


        Collections.sort(amountsSpent);
        int middle = amountsSpent.size() / 2;
        middle = middle > 0 && middle % 2 == 0 ? middle - 1 : middle;
        return amountsSpent.get(middle);
    }


    public static String popularGame() {
        List<ShopOrder> a = ShopOrder.findAll();
        List<String> popGames = new ArrayList<String>() {
        };
        for (int i = 0; i < a.size(); i++) {
            List<OrderItem> ab = a.get(i).getItems();
            for (int j = 0; j < ab.size(); j++) {
                popGames.add(ab.get(j).getProduct().getName());
            }
        }
        return "Most popular game:" + mostCommonElement(popGames);
    }


    public static int amountofCustomers() {
        List<Customer> itr = Customer.findAll();
        int count = 0;
        for (int i = 0; i < itr.size(); i++) {
            count++;
        }
        return count;
    }

    public static String popularDiscount() {
        List<ShopOrder> a = ShopOrder.findAll();
        List<String> discountsUsed = new ArrayList<String>() {
        };
        for (int i = 0; i < a.size(); i++) {
            List<OrderItem> ab = a.get(i).getItems();
            for (int j = 0; j < ab.size(); j++) {
                String compare = ab.get(j).getDiscount().getDiscountID();
                if (!compare.equals("null")) {
                    discountsUsed.add(compare);
                }
            }
        }
        return mostCommonElement(discountsUsed);
    }


    //https://deveshsharmablogs.wordpress.com/2013/07/16/find-most-common-element-in-a-list-in-java/
    private static String mostCommonElement(List<String> list) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < list.size(); i++) {

            Integer frequency = map.get(list.get(i));
            if (frequency == null) {
                map.put(list.get(i), 1);
            } else {
                map.put(list.get(i), frequency + 1);
            }
        }

        String mostCommonKey = null;
        int maxValue = -1;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() > maxValue) {
                mostCommonKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }

        return mostCommonKey;
    }


    public static void PieChart() { // This is the ugliest function I've ever written. I'm so sorry
        List<Product> a = Product.findAll();
        List<ShopOrder> ab = ShopOrder.findAll();

        int NSC = 0;
        int PCC = 0;
        int XBC = 0;
        int PSC = 0; // they look like processor registers lol


        List<ShopOrder> az = new ArrayList<ShopOrder>();
        List<OrderItem> total = new ArrayList<OrderItem>();
        for (int i = 0; i < ab.size(); i++) {
            az.add(ab.get(i));
        }


        for (int i = 0; i < az.size(); i++) {
            total.addAll(az.get(i).getItems());
        }

        for (int i = 0; i < total.size(); i++) {
            if (total.get(i).getProduct().getPlatform().getName().equals("Nintendo Switch")) {
                NSC++;
            } else if (total.get(i).getProduct().getPlatform().getName().equals("PlayStation 4")) {
                PSC++;
            } else if (total.get(i).getProduct().getPlatform().getName().equals("Xbox One")) {
                XBC++;
            } else if ((total.get(i).getProduct().getPlatform().getName().equals("PC"))) {
                PCC++;
            }
        }


        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Xbox One", new Double(XBC));
        dataset.setValue("PlayStation 4", new Double(PSC));
        dataset.setValue("PC", new Double(PCC));
        dataset.setValue("Nintendo Switch", new Double(NSC));


        JFreeChart chart = ChartFactory.createPieChart(
                "Platform Sales",   // chart title
                dataset,          // data
                true,             // include legend
                true,
                false);

        int width = 320;   /* Width of the image */
        int height = 240;  /* Height of the image */
        File pieChart = new File("public//images//statImages//PieChart.jpeg");
        try {
            ChartUtils.saveChartAsJPEG(pieChart, chart, width, height);
        } catch (java.io.IOException ex) {
            System.out.println(ex.toString());
            System.out.println("Could not find file ");
        }

    }

    public static String systemDetails() {
        String details = "";
        String details1 = "Available cores in system: " + Runtime.getRuntime().availableProcessors() + System.lineSeparator();
        String details2 = "Max memory: " + formatSize(Runtime.getRuntime().maxMemory()) + System.lineSeparator();
        String details3 = "Available memory: " + formatSize(Runtime.getRuntime().totalMemory()) + System.lineSeparator();
        details += details1 + details2 + details3;
        return details;
    }

    public static String formatSize(long v) {
        if (v < 1024) return v + " B";
        int z = (63 - Long.numberOfLeadingZeros(v)) / 10;
        return String.format("%.1f %sB", (double) v / (1L << (z * 10)), " KMGTPE".charAt(z));
    } // https://stackoverflow.com/questions/3758606/how-to-convert-byte-size-into-human-readable-format-in-java


}
