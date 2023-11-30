import java.util.Scanner;

public class Charloop {
    public static void main(String[] args) {
        char input;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the character");
        input = scan.nextLine().charAt(0);
        if (input >= 97 && input <= 125) {
            small_Print(input);
        } else {
            captail_Print(input);
        }
        scan.close();

    }

    public static void small_Print(char input) {
        for (char ans = input; ans <= 'z'; ans++) {
            System.out.print(ans + " ");
        }
    }

    public static void captail_Print(char input) {
        for (char ans = input; ans <= 'Z'; ans++) {
            System.out.print(ans + " ");
        }
    }
}
