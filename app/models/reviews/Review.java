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

    @ManyToOne
    private Customer Customer;

    @ManyToOne
    private Product product;

    private Date date;

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
                        .orderBy("author asc")
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
                        .orderBy("author asc")
                        .findList();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRating() {
        return rating;
    }

    public Customer getCustomer() {
        return Customer;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setAuthor(Customer c){
        this.Customer = c;
    }

    public void setProduct(Product p){
        this.product = p;
    }

    public void setDate() {
        this.date = new Date();
    }

    public Product getProduct() {
        return product;
    }

    public Date getDate() {return date;}



    public String reviewStars(){
        String stars = "";
        for (int i = 0; i < rating; i++) {
            stars+="★";
        }

        for (int i = 0; i < 5-rating; i++) {
            stars+="☆";
        }

        return stars;
    }
}

