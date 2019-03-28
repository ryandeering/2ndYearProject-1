package models.reviews;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.products.*;
import models.users.*;

// Product entity managed by Ebean
@Entity
public class Review extends Model {

    // Fields - note that these are defined as public and not private
    // During compile time, The Play Framework
    // automatically generates getters and setters
    @Id
    private Long id;

    @OneToOne
    private Customer Customer;

    @OneToOne
    private Product product;
    
    // List of product ids - this will be bound to checkboxes in the view form
    private List<Long> prodSelect = new ArrayList<Long>();

    @Constraints.Required
    private int rating;

    @Constraints.Required
    private String content;

    // Default constructor
    public  Review() {
    }

    // Constructor to initialise object
    public  Review(Long id, int rating, String content){
        this.id = id;
        this.rating = rating;
        this.content = content;
    }
	
	//Generic query helper for entity Computer with id Long
    public static Finder<Long,Review> find = new Finder<Long,Review>(Review.class);

    // Find all Products in the database
    // Filter product id 
    public static List<Review> findAll(String filter) {
        return Review.find.query().where()
                        // name like filter value (surrounded by wildcards)
                        .ilike("id", "%" + filter + "%")
                        .orderBy("id asc")
                        .findList();
    }
    
    // Find all Products for a category
    // Filter product id 
    public static List<Review> findFilter(Long prodID, String filter) {
        return Review.find.query().where()
                        // Only include products from the matching cat ID
                        // In this case search the ManyToMany relation
                        .eq("products.id", prodID)
                        // name like filter value (surrounded by wildcards)
                        .ilike("id", "%" + filter + "%")
                        .orderBy("id asc")
                        .findList();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public List<Product> getProducts() {
//        return categories;
//    }
//
//    public void setProducts(List<Product> products) {
//        this.categories = categories;
//    }

    public List<Long> getProdSelect() {
        return prodSelect;
    }

    public void setProdSelect(List<Long> prodSelect) {
        this.prodSelect = prodSelect;
    }

//    public String getEmail() {
//        return user_email;
//    }
//
//    public void setEmail(String email) {
//        this.user_email = email;
//    }
//
//    public int getProduct() {
//        return product_id;
//    }
//
//    public void setProduct(int id) {
//        this.product_id = id;
//    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}

