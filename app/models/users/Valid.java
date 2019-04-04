package models.users;

import io.ebean.Finder;
import io.ebean.Model;
import org.mindrot.jbcrypt.BCrypt;
import play.data.validation.Constraints;

import javax.persistence.*;



@Entity

public class Valid extends Model {
    private String password2;


    public Valid(String password2) {
        this.password2 = password2;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }
}