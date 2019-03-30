package models.users;



import java.util.*;
import javax.persistence.*;


import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import models.*;
import models.shopping.*;

@Table(name="USER")

@DiscriminatorValue("customer")
@Entity
public class Customer extends User {


    @OneToOne(mappedBy="customer", cascade = CascadeType.ALL)
    private Basket basket;
    @OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
    private List<ShopOrder> orders;
	
    public Customer(String email, String password, String fName, String lName, String role) {
        super(email, password, fName, lName, role);
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



}