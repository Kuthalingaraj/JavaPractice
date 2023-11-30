import java.util.Scanner;

/**
 * Table
 */
public class Table {

    public static void main(String[] args) {
        int input;
        System.out.println("Press 1 for Multiplication Table:\nPress 2 for Subtraction Table:");
        Scanner scan = new Scanner(System.in);
        input = scan.nextInt();

        switch (input) {
            case 1:
                multiplication_Method();
                break;
            case 2:
                subtraction_Method();
                break;
            default:
                System.out.println("Please Enter Correct One :");
                break;
        }

        scan.close();
    }

    private static void multiplication_Method() {
        int table_Number, limit;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Table Number\t:");
        table_Number = s.nextInt();
        System.out.println("Enter the Limit\t:");
        limit = s.nextInt();

        for (int i = 1; i <= limit; i++) {
            System.out.println(i + " " + " * " + table_Number + "\t=" + (i * table_Number));
        }
        s.close();
    }

    private static void subtraction_Method() {
        int table_Number, limit;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Table Number\t:");
        table_Number = s.nextInt();
        System.out.println("Enter the Limit\t:");
        limit = s.nextInt();
        for (int i = 1; i <= limit; i++) {
            System.out.println(i + "-" + table_Number + "\t=" + (i - table_Number));
        }
        s.close();
    }
}