
public class customerTable {
    
    public customerTable(int totalPrice, int tableNumber, double totalFee) {
        super();
        this.totalPrice = totalPrice;
        this.tableNumber = tableNumber;
        this.totalFee = totalFee;
    }
    
    private int totalPrice;
    private int tableNumber;
    private double totalFee;

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(double totalFee) {
        this.totalFee = totalFee;
    }

}
