package models.shopping;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.products.*;
import models.users.*;


// Product entity managed by Ebean
@Entity
public class Basket extends Model {

    @Id
    private Long id;

    @OneToMany(mappedBy = "basket", cascade = CascadeType.PERSIST)
    private List<OrderItem> basketItems;

    @OneToOne
    private Customer customer;

    @ManyToOne
    public Discount discount;


    // Default constructor
    public  Basket() {

    }

    // Add product to basket
    // Either update existing order item or ad a new one.
    public void addProduct(Product p) {
        boolean itemFound = false;
        // Check if product already in this basket
        // Check if item in basket
        // Find orderitem with this product
        // if found increment quantity
        for (OrderItem i : basketItems) {
            i.setDiscount(getDiscount());
            if (i.getProduct().getId() == p.getId()) {
                i.increaseQty();
                itemFound = true;
                break;
            }
        }
        if (itemFound == false) {
            // Add orderItem to list
            OrderItem newItem = new OrderItem(p);
            newItem.setDiscount(discount);
            // Add to items
            basketItems.add(newItem);
        }
    }

    public void removeItem(OrderItem item, Product ios) {

        // Using an iterator ensures 'safe' removal of list objects
        // Removal of list items is unreliable as index can change if an item is added or removed elsewhere
        // iterator works with an object reference which does not change
        for (Iterator<OrderItem> iter = basketItems.iterator(); iter.hasNext();) {
            OrderItem i = iter.next();
            if (i.getId().equals(item.getId()))
            {
                // If more than one of these items in the basket then decrement
                if (i.getQuantity() > 1 ) {
                    i.decreaseQty();
                    ios.incrementStock();
                    ios.update();
                }
                // If only one left, remove this item from the basket (via the iterator)
                else {
                    // delete object from db
                    i.delete();
                    ios.incrementStock();
                    ios.update();
                    // remove object from list
                    iter.remove();
                    break;
                }
            }
        }
    }

    public void removeAllItems() {
        for(OrderItem i: this.basketItems) {

            Product ios = Product.find.byId(i.getProduct().getId());
            if(ios.getId() == i.getProduct().getId())
            {
                int quantity = i.getQuantity();
                ios.incrementStock(quantity);
                ios.update();
            }
            i.delete();

        }
        this.basketItems = null;
    }

    public double getBasketTotal() {

        double total = 0;

        for (OrderItem i: basketItems) {
            total += i.getItemTotal();
        }
        return discountPrice(total);
    }

    //Generic query helper
    public static Finder<Long,Basket> find = new Finder<Long,Basket>(Basket.class);

    //Find all Products in the database
    public static List<Basket> findAll() {
        return Basket.find.all();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OrderItem> getBasketItems() {
        return basketItems;
    }

    public void setBasketItems(List<OrderItem> basketItems) {
        this.basketItems = basketItems;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double discountPrice(double total){
        if (!discount.getDiscountID().equals("null") & discount.isValid() == true){
            double discountAmount = total * discount.getAmount();
            System.out.println();
            return total - discountAmount / 100;
        }
            System.out.println(discount.getAmount());
            System.out.println(total);
            return total;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public Discount getDiscount() {
        return discount;
    }

    public double getDiscountAmount(){
        return discount.getAmount();
    }
}

