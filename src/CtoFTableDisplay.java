public class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.println("    C|F    ");
        for (int i = -100; i <= 100; i++) {
            System.out.printf("%4d | %-6.2f%n", i, SafeInput.CtoF(i));
        }
    }
}