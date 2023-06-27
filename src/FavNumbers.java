import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        int favInt;
        double favDouble;
        Scanner in = new Scanner(System.in);

        favInt = SafeInput.getInt(in, "Enter your favorite integer");
        favDouble = SafeInput.getDouble(in, "Enter your favorite double");
        System.out.print("Your favorite integer is " + favInt + " and your favorite double is " + favDouble + ".");
    }
}