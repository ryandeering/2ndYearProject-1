package models.users;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import org.mindrot.jbcrypt.BCrypt;
import play.data.validation.*;





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
