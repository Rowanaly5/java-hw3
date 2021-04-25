import java.io.*;
import java.util.*;
public class main {
    public static void main (String [] Args) {

        customer customer = new customer(1, "adam", "Ahmed", "alyyahme@gmail.com",
                "012345874", "new cairo");

        person person = new person("ahmed", "Aly", "alyyahme@gmail.com", "012345874", "new cairo");
        cashier cashier = new cashier(1, 5000.00, "Mohamed ", "Aly", "alyyahme@gmail.com",
                "012345874", "new cairo");
        person.displayinfo();
        customer.displayinfo();
        cashier.displayinfo();

        customer.EnterShop();


        List<items> item = new ArrayList<items>();
        items i1 = new items("Olives ", 3, 100.0, 1);
        items i2 = new items("Cheese ", 2, 50.0, 2);
        items i3 = new items("Bread", 1, 75.0, 3);
        items i4 = new items("Eggs", 50, 10.0, 4);
        items i5 = new items("Chicken Salami", 2, 100.0, 5);
        cart cart = new cart();
        cart.addToCart(i1);
        cart.addToCart(i2);
        cart.addToCart(i3);
        cart.addToCart(i4);
        cart.addToCart(i5);

        cart.printCartItems();
        cart.getPayableAmount();
        cart.getTotalAmount();




            //-------            //-----------------------------------------------------------
            invoice invoice = new invoice();

            invoice.displayinvoice();
        }

    }
