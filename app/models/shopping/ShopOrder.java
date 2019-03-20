package models.shopping;

import java.text.DateFormat;
import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import java.util.Date;

import models.products.*;
import models.users.*;
import java.text.SimpleDateFormat;
// ShopOrder entity managed by Ebean
@Entity
public class ShopOrder extends Model {

    @Id
    private Long id;

    private Date OrderDate;

    @OneToMany(mappedBy="order", cascade = CascadeType.ALL)
    private List<OrderItem> items;


    @ManyToOne
    private Customer customer;


    // Default constructor
    public  ShopOrder() {
        OrderDate = new Date();
    }

    public double getOrderTotal() {

        double total = 0;

        for (OrderItem i: items) {
            i.setDiscount(customer.getBasket().getDiscount()); // iterates discount
            total += i.getItemTotal();
        }

        return total;
    }

    //Generic query helper
    public static Finder<Long,ShopOrder> find = new Finder<Long,ShopOrder>(ShopOrder.class);

    //Find all Products in the database
    public static List<ShopOrder> findAll() {
        return ShopOrder.find.all();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return OrderDate;
    }


    public Calendar toCalendar(){
        Date date = getOrderDate();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal;
    }


    public void setOrderDate(Date orderDate) {
        OrderDate = orderDate;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public String getOrderDateString() {
        if(OrderDate == null) {
            return "No Date Available";
        }
        String s = new SimpleDateFormat("dd-MMM-yyyy").format(OrderDate.getTime());
        return s;
    }


    public void adjustStock(){
        for (OrderItem i : items) {
            Product ios = Product.find.byId(i.getProduct().getId());
            if (i.getProduct().getId() == ios.getId()) {
                int quantity = i.getQuantity();
                ios.incrementStock(quantity);
                ios.update();
            }
        }
    }


}

