import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj rok: ");
        Integer year = scan.nextInt();

        if ((year % 4 == 0 && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Rok " + year + " jest przestępny");
        } else {
            System.out.println("Rok " + year + " nie jest przestępny");
        }
    }
}