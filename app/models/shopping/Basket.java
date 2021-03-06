package models.shopping;

import io.ebean.Finder;
import io.ebean.Model;
import models.products.Product;
import models.users.Customer;

import javax.persistence.*;
import java.util.Iterator;
import java.util.List;


// Product entity managed by Ebean
@Entity
public class Basket extends Model {

    @Id
    private Long id;

    @OneToMany(mappedBy = "basket", cascade = CascadeType.ALL)
    private List<OrderItem> basketItems;

    @OneToOne
    private Customer customer;

    @ManyToOne
    public Discount discount;


    private boolean discountSet;

    // Default constructor
    public Basket() {
        discountSet = false;
    }

    public boolean isDiscountSet() {
        return discountSet;
    }

    public void setDiscountSet(boolean discountSet) {
        this.discountSet = discountSet;
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
        for (Iterator<OrderItem> iter = basketItems.iterator(); iter.hasNext(); ) {
            OrderItem i = iter.next();
            if (i.getId().equals(item.getId())) {
                // If more than one of these items in the basket then decrement
                if (i.getQuantity() > 1) {
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
        for (OrderItem i : this.basketItems) {

            Product ios = Product.find.byId(i.getProduct().getId());
            if (ios.getId() == i.getProduct().getId()) {
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

        for (OrderItem i : basketItems) {
            total += i.getItemTotal();
        }
        return total;
    }

    //Generic query helper
    public static Finder<Long, Basket> find = new Finder<Long, Basket>(Basket.class);

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

//    public double discountPrice(double total) {
//        if (!discount.getDiscountID().equals("null") & discount.isValid() == true) {
//            double discountAmount = total * discount.getAmount();
//            System.out.println();
//        }
//        System.out.println(discount.getAmount());
//        System.out.println(total);
//        return total;
//    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public Discount getDiscount() {
        return discount;
    }

    public double getDiscountAmount() {
        return discount.getAmount();
    }
}

