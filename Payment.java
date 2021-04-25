import java.util.ArrayList;

public class Payment {

    double tax;
    ArrayList<items> item = null;
    private String productName;
    private int quantity;
    private double unitPrice;
    int pid;
    double totalAmount;
    double payableAmount;
    public void displayinvoice()
    {
        System.out.println("Item Number: "+pid);
        System.out.println("Name: "+productName);
        System.out.println("Quantity: "+quantity);
        System.out.println("Price: "+unitPrice);
        System.out.println("TAX: "+tax);
        System.out.println("Payable Amount: "+payableAmount);
        System.out.println("Total Cost: "+totalAmount);
    }
}
