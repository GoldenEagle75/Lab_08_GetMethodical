import java.util.Scanner;

public class BirthDateTime {
    public static void main (String [] args){
        int birthYear;
        int birthMonth;
        int birthDay;
        int birthHour;
        int birthMinute;

        Scanner in = new Scanner(System.in);

        birthYear = SafeInput.getRangedInt(in, "Enter your birth year", 1950,2015);
        birthMonth = SafeInput.getRangedInt(in, "Enter your birth month", 1,12);

        birthDay = switch (birthMonth) {
            case 1, 3, 5, 7, 8, 10, 12 -> SafeInput.getRangedInt(in, "Enter the day of the month you were born", 1, 31);
            case 2 -> SafeInput.getRangedInt(in, "Enter the day of the month you were born", 1, 29);
            default -> SafeInput.getRangedInt(in, "Enter the day of the month you were born", 1, 30);
        };

        birthHour = SafeInput.getRangedInt(in, "Enter the hour of your birth", 1,24);
        birthMinute = SafeInput.getRangedInt(in, "Enter the minute of your birth", 1,59);

        System.out.printf("You were born on %s/%s/%s at %s:%s.%n", birthMonth, birthDay, birthYear,birthHour,birthMinute);
    }
}
