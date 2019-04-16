package models.shopping;

import io.ebean.Finder;
import io.ebean.Model;
import models.products.Product;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.SQLOutput;
import java.util.List;

// OrderItem entity managed by Ebean
@Entity
public class OrderItem extends Model {

    @Id
    private Long id;

    @ManyToOne
    private ShopOrder order;

    @ManyToOne
    private Basket basket;

    // Unidirection mapping - Many order items can have one product
    // Product not interested in this
    @ManyToOne
    private Product product;

    @ManyToOne
    public Discount discount;


    private int quantity;
    private double price;

    // Default constructor
    public OrderItem() {
    }

    public OrderItem(Product p) {
        product = p;
        quantity = 1;
        price = p.getPrice();
    }


    // Increment quantity
    public void increaseQty() {
        quantity += 1;
    }

    // Decrement quantity
    public void decreaseQty() {
        quantity -= 1;
    }

    // Calculate and return total price for this order item
    public double getItemTotal() {
        double total = this.price * this.quantity;
        double total2 = total * (2 - discount.getAmount());
        System.out.println(discount.getAmount());
        System.out.println("THIS IS TOTAL 2 " + total2);
        return total2;

    }

    //Generic query helper
    public static Finder<Long, OrderItem> find = new Finder<Long, OrderItem>(OrderItem.class);

    //Find all Products in the database
    public static List<OrderItem> findAll() {
        return OrderItem.find.all();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShopOrder getOrder() {
        return order;
    }

    public void setOrder(ShopOrder order) {
        this.order = order;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}

