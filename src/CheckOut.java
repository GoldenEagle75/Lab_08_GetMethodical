import java.util.Scanner;

public class CheckOut {
    public static void main (String [] args){
        double itemPrice;
        double totalPrice=0;

        Scanner in = new Scanner(System.in);

        do {
            itemPrice = SafeInput.getRangedDouble(in,"Enter the price of the item", .5,10);
            totalPrice += itemPrice;
        } while (SafeInput.getYNConfirm(in,"Would you like to continue [Y/N]?"));

        System.out.printf("The total price of your items is %.2f.%n", totalPrice);
    }
}
