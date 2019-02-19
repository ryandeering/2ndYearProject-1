package models.users;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.validation.*;



@Entity
// specify mapped table name
@Table(name = "USER")
// map subclasses to a single table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
// the discriminator column is used to define User type
@DiscriminatorColumn(name = "role")
// the User type of this class (the base class) is "User"
@DiscriminatorValue("user")

public class User extends Model {
    @Id
    private String email;

    @Constraints.Required
    private String role;

    @Constraints.Required
    private String name;
    
    @Constraints.Required
    private String password;




    public static final Finder<Long, User> find = new Finder<>(User.class);

    public static final List<User> findAll() {
        return User.find.all();
    }

    public static User authenticate(String email, String password) {
        return find.query().where().eq("email", email).eq("password", password).findUnique();
    }

    public static User getUserById(String id) {
        if (id == null) {
            return null;
        } else {
            return find.query().where().eq("email", id).findUnique();
        }
    }

    public User() {

    }

    public User(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}