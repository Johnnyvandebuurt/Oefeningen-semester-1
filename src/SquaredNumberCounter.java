import java.util.Scanner;
public class SquaredNumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dit programma verheft getallen tot de tweede macht.");
        System.out.println("Tot welk getal wilt u de berekening uitvoeren? : ");
        int getal1 = scanner.nextInt();
    }

    static int power(int getal1) {
        int getal2 = getal1 * getal1;
        return getal2;
    }
}




