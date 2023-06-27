import java.util.Scanner;

public class Reggie {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        String socialSecNumber;
        String UCID;
        String menuChoice;

        socialSecNumber = SafeInput.getRegExString(in, "Enter your social security number", "^\\d{3}-\\d{2}-\\d{4}$");
        UCID = SafeInput.getRegExString(in,"Enter your UC ID", "^(M|m)\\d{5}$");
        menuChoice = SafeInput.getRegExString(in,"Enter your action [O/S/V/Q]", "^[OoSsVvQq]$");

        System.out.println("Your social security number is " + socialSecNumber + ", your UC ID is " + UCID + ".");
    }
}
