import java.util.Scanner;

public class Colors {

    public static String enterFirstLetterOfColour(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter the first letter of colour:");
            String letter = scanner.nextLine().trim().toUpperCase();
            switch (letter){
                case "W":
                   return "White";
                case "B":
                    return "Black";
                case "Y":
                    return "Yellow";
                case "G":
                    return "Green";
                default:
                    System.out.println("Sorry we don't have a color that starts with that letter. Choose a different letter.");
            }
        }
    }
}