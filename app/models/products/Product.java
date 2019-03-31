package models.products;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import models.reviews.Review;
import play.data.format.*;
import play.data.validation.*;

import models.shopping.*;


@Entity
public class Product extends Model {


    @Id
    private Long id;

    // many to many mapping
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "products")
    private List<Category> categories = new ArrayList<Category>();

    @ManyToOne
    private Platform platform;


    private List<Long> catSelect = new ArrayList<Long>();

    @Constraints.Required
    private String name;

    @Constraints.Required
    private String description;

    @Constraints.Required
    private int	stock;

    @Constraints.Required
    private double price;

    @Constraints.Required
    private String developer;

    @Constraints.Required
    private String publisher;

    @OneToMany(cascade = CascadeType.ALL,mappedBy="product")
    private List<Review> reviews;

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    // Default constructor
    public  Product() {
    }

    // Constructor to initialise object
    public  Product(Long id, String name, String description, int stock, double price, String developer, String publisher){
        this.id = id;
        this.name = name;
        this.description = description;
        this.stock = stock;
        this.price = price;
        this.developer = developer;
        this.publisher = publisher;
    }
	
	//Generic query helper for entity Computer with id Long
    public static Finder<Long,Product> find = new Finder<Long,Product>(Product.class);

    // Find all Products in the database
    // Filter product name 
    public static List<Product> findAll(String filter) {
        return Product.find.query().where()
                        // name like filter value (surrounded by wildcards)
                        .ilike("name", "%" + filter + "%")
                        .orderBy("name asc")
                        .findList();
    }
    
    // Find all Products for a category
    // Filter product name 
    public static List<Product> findFilter(Long catID, String filter) {
        return Product.find.query().where()
                        // Only include products from the matching cat ID
                        // In this case search the ManyToMany relation
                        .eq("categories.id", catID)
                        // name like filter value (surrounded by wildcards)
                        .ilike("name", "%" + filter + "%")
                        .orderBy("name asc")
                        .findList();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String stockShortage(){
       if (getStock() > 5){
           return "In stock!";
        } else if (getStock() > 0){
           return "Short in stock.";
       }  else {
           return "Out of stock.";
       }

    }

    public int decrementStock() {
        return stock--;
    }
    public int incrementStock() {
        return stock++;
    }


    public void incrementStock(int qty){
        stock +=qty;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public List<Long> getCatSelect() {
        return catSelect;
    }

    public void setCatSelect(List<Long> catSelect) {
        this.catSelect = catSelect;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public static final Finder<Long, Product> finda = new Finder<>(Product.class);
    // for all products

    public static final List<Product> findAll() {
        return Product.finda.all();
    }


    public String reviewCount(){
        int count = 0;
        String msg;
        List<Review> rList = getReviews();
        for (int i = 0; i < rList.size(); i++) {
           if(rList.get(i) != null) {
               count++;
           }
        }

        if(count == 0){
            msg = "No reviews found.";
        } else {
            msg = (count + " reviews.");
        }

        return msg;
    }

}

