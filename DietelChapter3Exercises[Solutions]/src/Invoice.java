public class Invoice {
    private String partNumber;
    private String partDescription;
    private int itemQuantity;
    private double itemPrice;
    private double invoiceAmount;

    public Invoice(String partNumber, String partDescription, int itemQuantity, double itemPrice)
    {   this.partNumber= partNumber;
        this.partDescription=partDescription;
        this.itemQuantity=itemQuantity;
        this.itemPrice=itemPrice;
        }
    public String getPartDescription() {
        return partDescription;
    }
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
    public String getPartNumber() {
        return partNumber;
    }
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    public int getItemQuantity() {
        return itemQuantity;
    }
    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
    public double getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    public double getInvoiceAmount() {
      if(itemQuantity>0) {
          invoiceAmount=itemPrice*itemQuantity;
      }
      if(itemQuantity<=0){
          invoiceAmount=0;
      }
      return invoiceAmount;
    }
}



