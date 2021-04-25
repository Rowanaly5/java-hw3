import java.util.Date;

public class creditcard   extends Payment{
int cardnumb = 0;
Date expiredate ;

public creditcard(int cardnumb , Date expiredate){
    this.cardnumb =cardnumb;
    this.expiredate =expiredate;
}
    @Override
    public void displayinvoice() {
        super.displayinvoice();
    }
}
