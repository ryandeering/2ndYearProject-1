package models.users;


import io.ebean.Finder;
import models.reviews.Review;
import models.shopping.Basket;
import models.shopping.ShopOrder;

import javax.persistence.*;
import java.util.List;

@Table(name = "USER")

@DiscriminatorValue("customer")
@Entity
public class Customer extends User {


    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    private Basket basket;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<ShopOrder> orders;
    @OneToMany(mappedBy = "Customer", cascade = CascadeType.ALL)
    private List<Review> reviews;
    @OneToOne(cascade = CascadeType.ALL)
    public Address address;


    public Customer(String email, String password, String fName, String lName, String role) {
        super(email, password, fName, lName, role);
        this.address = address;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public List<ShopOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ShopOrder> orders) {
        this.orders = orders;
    }


    public static final Finder<Long, Customer> find = new Finder<>(Customer.class);

    public static final List<Customer> findAll() {
        return Customer.find.all();
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}