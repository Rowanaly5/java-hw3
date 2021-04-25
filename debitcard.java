import java.util.Date;

public class debitcard extends Payment {
    int dcardnumb = 0;
    Date dexpiredate ;

    public debitcard(int dcardnumb , Date dexpiredate){
        this.dcardnumb =dcardnumb;
        this.dexpiredate =dexpiredate;
    }
    @Override
    public void displayinvoice() {
        super.displayinvoice();
    }
}
