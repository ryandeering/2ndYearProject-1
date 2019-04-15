package models.users;

import io.ebean.Model;

import javax.persistence.Entity;


@Entity

public class Valid extends Model {


    // This is the password validation class.

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