import akka.actor.ActorSystem;
import models.products.Product;
import models.shopping.Discount;
import models.shopping.OrderItem;
import models.shopping.ShopOrder;
import models.users.Customer;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import play.mvc.Result;
import scala.concurrent.ExecutionContextExecutor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionStage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;
import static org.hamcrest.CoreMatchers.is;
import static play.test.Helpers.contentAsString;

/**
 * Unit testing does not require Play application start up.
 *
 * https://www.playframework.com/documentation/latest/JavaTest
 */
public class UnitTest {

    @Test
    public void applyDiscountCheck() {
        Product p = new Product(20L, "Game", "aa", 2, 60.00, "nintendo", "nintendo");
        OrderItem o = new OrderItem(p);
        o.setDiscount(new Discount("BIGSAVING", "Saving", true, 0.15));
        ShopOrder so = new ShopOrder();
        List<OrderItem> items = new ArrayList<>();
        items.add(o);
        so.setItems(items);
        System.out.println("aaa " + so.getOrderTotal());
        MatcherAssert.assertThat(so.getOrderTotal(), is(51.00));
    }

    @Test
    public void accountCreation(){
        Customer c = new Customer("test@test.com","password","Test", "Test", "customer");
        assertThat(c.getfName().equals("Test"));
    }


}
