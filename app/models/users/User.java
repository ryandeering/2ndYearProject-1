package models.users;

import io.ebean.Finder;
import io.ebean.Model;
import org.mindrot.jbcrypt.BCrypt;
import play.data.validation.Constraints;

import javax.persistence.*;


@Entity
// specify mapped table name
@Table(name = "USER")
// map subclasses to a single table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//the discriminator column is used to define User type
@DiscriminatorColumn(name = "type")
@DiscriminatorValue("user")

public class User extends Model {
	@Id
	private String email;

	@Constraints.Required
	private String fName;

	@Constraints.Required
	private String lName;

	private String password;

	private String role;

	public static final Finder<Long, User> find = new Finder<>(User.class);


	public static User authenticate(String email, String password) {
		User user = User.find.query().where().eq("email", email).findUnique();

		if (user != null && BCrypt.checkpw(password, user.getPassword())) { // bcrypt method
			return user;
		} else {
			return user = null;
		}
	}

	public static User getUserById(String email) {
		if (email == null) {
			return null;
		} else {
			return find.query().where().eq("email", email).findUnique();
		}
	}

	// Check if a user is logged in (by id - email address)
	public static User getLoggedIn(String email) {
		if (email == null)
			return null;
		else
			// Find user by id and return object
			return find.query().where().eq("email", email).findUnique();
	}


	public User() {

	}

	public User(String email, String fName, String lName, String password, String role) {
		this.email = email;
		this.fName = fName;
		this.lName = lName;
		this.password = password;
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public static Finder<Long, User> getFind() {
		return find;
	}


	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}