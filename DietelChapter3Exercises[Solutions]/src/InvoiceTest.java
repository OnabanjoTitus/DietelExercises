import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Invoice sales= new Invoice("1234","LAPTOP CHARGER",0,0);
        System.out.printf("THE NUMBER OF THE PART IS %s,THE PART NAME OF THE PART IS %s,THE QUANTITY OF THE ITEM IS %d AND THE ITEM PRICE %.2f",sales.getPartNumber(),sales.getPartDescription(),sales.getItemQuantity(),sales.getItemPrice());
        System.out.printf("The amount on the invoice is %.2f",sales.getInvoiceAmount());
        System.out.println();
        System.out.println("Enter the part number:");
        String number=input.nextLine();
        sales.setPartNumber(number);
        System.out.println("Enter the part description:");
        String description=input.nextLine();
        sales.setPartDescription(description);
        System.out.println("Enter the item Quantity:");
        int quantity= input.nextInt();
        sales.setItemQuantity(quantity);
        System.out.println("Enter the item price:");
        double price= input.nextDouble();
        sales.setItemPrice(price);
        System.out.printf("The name of the product is %s, the part number is %s, the quantity of the item is %d and the item price is %.2f",sales.getPartNumber(),sales.getPartDescription(),sales.getItemQuantity(),sales.getItemPrice());
        System.out.println();
        System.out.printf("The amount on the invoice is %.2f",sales.getInvoiceAmount());
    }
}
