import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
class cart {
    ArrayList<items> item;
    double totalAmount;
    double payableAmount;
    double tax;
    private double unitPrice;
    private int quantity;

    public cart() {
        this.item = new ArrayList<items>();
        this.totalAmount = 0;
        this.payableAmount = 0;
        this.tax = 0;
    }


    public void addToCart(items item) {
        this.item.add(item);
    }


    void printCartItems() {
        for (items item : item) {
            System.out.println(item.getProductName());
        }

    }


    public double getTotalAmount() {
        totalAmount = unitPrice * quantity;

        return this.totalAmount;
    }

    public double getPayableAmount() {
        this.payableAmount = 0;
        this.tax = this.totalAmount * (0.14);
        this.payableAmount = this.totalAmount + this.tax;
        return this.payableAmount;
    }
}