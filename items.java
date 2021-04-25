public class items {

        private String productName;
        private int quantity;
        private double unitPrice;
        int pid;

    public  items (String productName, int quantity, double unitPrice ,int pid) {
            this.productName = productName;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
            this.pid = pid;
        }

    public items() {

    }
    public void setProductName(String productName) {
        this.productName=productName;
    }
    public String getProductName() {
            return this.productName;
        }
    public void setQuantity(int quantity) {
        this.quantity=quantity;
    }
        public int getQuantity() {
            return this.quantity;
        }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice=unitPrice;
    }
        public double getUnitPrice() {
            return this.unitPrice;
        }
    public void setProductid(int pid) {
        this.pid=pid;
    }
    public int getproductid(int pid) {
        return this.pid;
    }

    }
