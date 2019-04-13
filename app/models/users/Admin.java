package models.users;

import io.ebean.Finder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;





@Table(name="USER")
// the user type of this class is "admin"
@DiscriminatorValue("admin")
@Entity
public class Admin extends User {

    public Admin(){
    }

    public Admin(String email, String fName, String lName, String password, String role) {
        super(email, fName, lName, password, role);
    }

    public static final Finder<Long, Admin> find = new Finder<>(Admin.class);

    public static final List<Admin> findAll() {
        return Admin.find.all();
    }





}
