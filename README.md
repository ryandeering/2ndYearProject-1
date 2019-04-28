
# 2nd Year Project

This was a final semester project, lasting three months, developed with two team members. It was originally situated to be a three member project, but our third member had to withdraw due to unforeseen circumstances.

It is an eCommerce application based on an online video game store, hooked up to a JDBC database. There are CRUD features for products, admin users and customer users, as well as creating and editing discounts. I am responsible for the following:

Login system + BCrypt implementation, CRUD Admin + Customer, product image upload functionality, Discount system, Review system, Statistics class, logfile, testing, Change Password + Address + Profile Picture functionality in profile page, content filter implementation, Eircode regex method implementation. 


To run the application. Type this into your terminal. It will run on localhost:9000.

```
sbt run
```
To login into the respective user types, use *customer@cdrgames.com* & *admin@cdrgames.com* to login. Both of these accounts have the same password: password.

## Built With

* [Play Framework 2.6](https://www.playframework.com/documentation/2.6.x/Home) - The web framework used
* [SBT](https://www.scala-sbt.org/) - Dependency Management
* [JBCrypt](https://www.mindrot.org/projects/jBCrypt/) - Used to encrypt passwords.
* [JFreeChart](http://www.jfree.org/jfreechart/) - Used to generate a pie chart.
* [Play Mailer](https://github.com/playframework/play-mailer) - Used to email a receipt.
* [jsPDF](https://github.com/MrRio/jsPDF) - Client-side receipt generation in the form of a PDF.
* [im4java](http://im4java.sourceforge.net/) - Image Upload

## Authors
* **Ryan Deering** - [ryandeering](https://github.com/ryandeering)
* **Daria Denisiuk** - [ritadaria1](https://github.com/ritadaria1)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
