import java.util.Scanner;

/*Prompt the user to enter their favorite integer and then their favorite double.  Use the unconstrained getInt and getDouble methods for this.

Really you only have two tests here, non-numeric input and valid numeric input for each method. */
public class FavNumbers {
    public static void main(String[] args) {
        int favInt = 0;
        double favDouble = 0;
        Scanner in = new Scanner(System.in);

        favInt = SafeInput.getInt(in, "Enter your favorite integer");
        favDouble = SafeInput.getDouble(in, "Enter your favorite double");
        System.out.print("Your favorite integer is " + favInt + " and your favorite double is " + favDouble + ".");
    }
}