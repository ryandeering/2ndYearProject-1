package models.users;

import javax.persistence.*;

@Entity
// the user type of this class is "admin"
@DiscriminatorValue("admin")
public class Admin extends User {
    public Admin(String email, String name, String password) {

        super(email, name, password);
    }
}
