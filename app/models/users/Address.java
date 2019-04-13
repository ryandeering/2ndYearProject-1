package models.users;
import io.ebean.Finder;
import io.ebean.Model;
import org.mindrot.jbcrypt.BCrypt;
import play.data.validation.Constraints;
import javax.persistence.*;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Entity
@Table(name = "ADDRESS")
public class Address {

    @Id
    private Long id;
    private String fName;
    private String lName;
    private String streetAddress;
    private String town;
    private String eircode; //postcode in general
    private String country;


    public Address(Long id, String fName, String lName, String streetAddress, String town, String eircode, String country) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.streetAddress = streetAddress;
        this.town = town;
        this.eircode = eircode;
        this.country = country;
    }


    public Address() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getEircode() {
        return eircode;
    }

    public void setEircode(String eircode) {
        this.eircode = eircode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public static final Finder<Long, Address> find = new Finder<>(Address.class);

    public static final List<Address> findAll() {
        return Address.find.all();
    }

    public static boolean eircodeCheck(String eircode){
        boolean check = false;

        String regex = "(?:^[AC-FHKNPRTV-Y][0-9]{2}|D6W)[ -]?[0-9AC-FHKNPRTV-Y]{4}$";
        //https://stackoverflow.com/questions/33391412/validation-for-irish-eircode
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(eircode);

        if(m.find() == true){
            check = true;
        }

        return check;
    }


}
