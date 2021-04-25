public class person {
    String FName = "fname" ;
    String LName = "lname" ;
    String Email = "email";
    String phone = "";
    String Address ="";

    public person(String fname, String LName,String Email, String phone ,String Address) {
      this.FName = fname;
      this.LName=LName;
      this.Address = Address;
      this.Email = Email;
      this.phone = phone;
    }
    public String getFName() {
        return FName;
    }
    public String getLName() {
        return LName;
    }
    public String getAddress() {
        return Address;
    }
    public String getEmail() {
        return Email;
    }
    public String getphone() {
        return phone;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public void setFName(String FName) {
        this.FName = FName;
    }
    public void setLName(String LName) {
        this.LName = LName;
    }
    public void setAddress(String Address) {
        this.Email = Address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /** Returns a self-descriptive String */


    public void displayinfo(){
        System.out.println("personal Info: " );
        System.out.println("Full Name : " + FName + LName );
        System.out.println("Email: " + Email);
        System.out.println("Phone Number: " + phone);
        System.out.println("Address: " + Address);

    }

}
