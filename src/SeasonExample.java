import java.util.Scanner;


public class SeasonExample {
    public static void main(String[] args) {

        System.out.print("Enter a month: ");
        Scanner in = new Scanner(System.in);
        String month = in.nextLine();

        switch (month.toLowerCase()) {
            case "deсember":
            case "january":
            case "february":
                System.out.println(Season.WINTER);
                break;

            case "march":
            case "april":
            case "may":
                System.out.println(Season.SPRING);
                break;

            case "june":
            case "july":
            case "august":
                System.out.println(Season.SUMMER);
                break;

            case "september":
            case "october":
            case "november":
                System.out.println(Season.AUTUM);
                break;
            default:
                System.out.println("No this month");
        }
    }
}
