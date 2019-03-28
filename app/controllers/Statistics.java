package controllers;

import models.shopping.OrderItem;
import models.shopping.ShopOrder;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.core.annotation.Order;
import play.mvc.*;
import play.data.*;
import javax.inject.Inject;
import javax.xml.bind.SchemaOutputResolver;

import views.html.*;
import play.db.ebean.Transactional;
import play.api.Environment;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;



import models.products.Product;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Collection.*;
import java.util.Map;

public class Statistics extends Controller{

    public static String medianPrice(){
        List<Product> a = Product.findAll();
        List<String> mc = new ArrayList<String>(a.size());
        for (int i = 0; i < mc.size(); i++) {
           mc.add(a.get(i).getPlatform().getName());
        }
        System.out.println(mostCommonElement(mc));

        String result = mostCommonElement(mc);

        return result;
    }




//https://deveshsharmablogs.wordpress.com/2013/07/16/find-most-common-element-in-a-list-in-java/
    private static String mostCommonElement(List<String> list) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        for(int i=0; i< list.size(); i++) {

            Integer frequency = map.get(list.get(i));
            if(frequency == null) {
                map.put(list.get(i), 1);
            } else {
                map.put(list.get(i), frequency+1);
            }
        }

        String mostCommonKey = null;
        int maxValue = -1;
        for(Map.Entry<String, Integer> entry: map.entrySet()) {

            if(entry.getValue() > maxValue) {
                mostCommonKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }

        return mostCommonKey;
    }


    public static void PieChart(){ // This is the ugliest function I've ever written.
        List<Product> a = Product.findAll();
        List<ShopOrder> ab = ShopOrder.findAll();

        int NSC = 0;
        int PCC = 0;
        int XBC = 0;
        int PSC = 0; // they look like processor registers lol


        List<ShopOrder> az = new ArrayList<ShopOrder>();
        List<OrderItem> total = new ArrayList<OrderItem>();
        for (int i = 0; i < ab.size(); i++) {
            az.add(ab.get(i));}


        for (int i = 0; i < az.size() ; i++) {
            total.addAll(az.get(i).getItems());
        }

        for (int i = 0; i < total.size(); i++) {
            if(total.get(i).getProduct().getPlatform().getName().equals("Nintendo Switch")){
                NSC++;
            }   else if (total.get(i).getProduct().getPlatform().getName().equals("PlayStation 4")){
                PSC++;
            } else if(total.get(i).getProduct().getPlatform().getName().equals("Xbox One")) {
                XBC++;
            } else if ((total.get(i).getProduct().getPlatform().getName().equals("PC"))){
                PCC++;
            }
        }


        DefaultPieDataset dataset = new DefaultPieDataset( );
        dataset.setValue("Xbox One", new Double(XBC) );
        dataset.setValue("PlayStation 4", new Double(PSC) );
        dataset.setValue("PC", new Double(PCC) );
        dataset.setValue("Nintendo Switch", new Double(NSC) );


        JFreeChart chart = ChartFactory.createPieChart(
                "Platform Sales",   // chart title
                dataset,          // data
                true,             // include legend
                true,
                false);

        int width = 320;   /* Width of the image */
        int height = 240;  /* Height of the image */
        File pieChart = new File( "public//images//statImages//PieChart.jpeg" );
        try {
            ChartUtils.saveChartAsJPEG(pieChart, chart, width, height);
        }
        catch(java.io.IOException ex){
            System.out.println (ex.toString());
            System.out.println("Could not find file ");
        }

    }

}
