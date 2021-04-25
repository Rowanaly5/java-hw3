import javax.lang.model.element.Name;
import java.io.*;
import java.util.*;
public class customer extends person {

    private int customerNumber;

    public customer (int cn,String FName,String LName, String Email, String phone ,String Address)

    {
        super( FName,LName,Email,phone,Address);
        this.customerNumber = cn;
    }

    public int getCustomerNumber() {

        return customerNumber;
    }


    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;

    }

       public  void buyitems(){
           System.out.println("I'm buing this item");
       }
    public void displayinfo(){
        System.out.println(" Customer's personal Info: " );
        System.out.println("Full Name : " + FName + LName );
        System.out.println("Customer Number: " + customerNumber);
        System.out.println("Email: " + Email);
        System.out.println("Phone Number: " + phone);
        System.out.println("Address: " + Address);

    }
    public String ShopName = "Carefor";
public void EnterShop(){
    System.out.println(" Enters : " + ShopName);

}

}