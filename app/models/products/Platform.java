package models.products;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

// Product entity managed by Ebean
@Entity
public class Platform extends Model {

    // Fields - note that these are defined as public and not private
    // During compile time, The Play Framework
    // automatically generates getters and setters


    @Id
    private Long id;

    @Constraints.Required
    private String name;

    // Platform contains many products
    @OneToMany(mappedBy = "platform", cascade = CascadeType.PERSIST)
    private List<Product> products; // = new ArrayList<Product>();

    // Default constructor
    public  Platform() {
    }

    public  Platform(Long id, String name, List<Product> products) {
        this.id = id;
        this.name = name;
        this.products = products;
    }

    //Generic query helper for entity Computer with id Long
    public static Finder<Long,Platform> find = new Finder<Long,Platform>(Platform.class);

    //Find all Products in the database
    public static List<Platform> findAll() {
        return Platform.find.query().where().orderBy("name asc").findList();
    }

    // Generate options for an HTML select control
    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Platform c: Platform.find.query().orderBy("name").findList()) {
            options.put(c.id.toString(), c.name);
        }
        return options;
    }


    // Check if a product is in a category

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}

