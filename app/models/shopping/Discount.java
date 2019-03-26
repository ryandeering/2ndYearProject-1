package models.shopping;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.products.*;
import models.users.*;


@Entity
public class Discount extends Model{

    @Id
    private String discountID;

    private String discountName;

    private boolean valid;

    private double amount;

    @OneToMany(mappedBy = "discount", cascade = CascadeType.PERSIST)
    public List<Basket> baskets;

    public Discount() {
        this.discountID = "null";
        this.discountName = "null";
        this.valid = true;
        this.amount = 1.0;
    }

    public Discount(String discountID) {
        this.discountID = discountID;
        this.discountName = "null";
        this.valid = true;
        this.amount = 1.0;
    }


    public Discount(String discountID, String discountName, boolean valid, double amount) {
        this.discountID = discountID;
        this.discountName = discountName;
        this.valid = valid;
        this.amount = amount;
    }

    public String getDiscountID() {
        return discountID;
    }

    public void setDiscountID(String discountID) {
        this.discountID = discountID;
    }

    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }


    public static final Finder<String, Discount> find = new Finder<>(Discount.class);

    public static final List<Discount> findAll() {
        return Discount.find.all();
    }

    public static Map<String,String> options(){
        LinkedHashMap<String,String> options = new LinkedHashMap<>();

        for(Discount d: Discount.findAll()){
            options.put(d.getDiscountID(),d.getDiscountName());
        }
        return options;
    }

    public static Discount getDiscountById(String discountID) {
        if (discountID == null) {
            return null;
        } else {
            return find.query().where().eq("discountID", discountID).findUnique();
        }
    }





    
}
