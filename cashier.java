import javax.lang.model.element.Name;

public class cashier extends person {

    private int id ;
    private double salary ;

    public cashier (int id,double salary,String FName,String LName, String Email, String phone ,String Address)

    {
        super( FName,LName,Email,phone,Address);
this.id = id;
this.salary = salary;
    }
    public int getCashierid() {

        return id;
    }
    public double getCashiersalary() {

        return salary;
    }

    public void setCashiersalary(double salary) {
        this.salary=salary;

    }

    public  void buyitems(){
        System.out.println("I'm buing this item");
    }
    public void recorditems(){

    }
    public void additems(){

    }

    public  void informtotal(){
        System.out.println("I'm buing this item");
    }
    public  void Displayinvoice(){
        System.out.println("I'm buing this item");
    }
    public void displayinfo(){
        System.out.println("Cashier's personal Info: " );

        System.out.println("Full Name : " + FName + LName );
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Email: " + Email);
        System.out.println("Phone Number: " + phone);
        System.out.println("Address: " + Address);

    }
}
