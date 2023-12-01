import java.util.Scanner;

public class Rev {
    public static void main(String[] args) {
        int input;
        System.out.println("Enter the Number:");
        Scanner scan = new Scanner(System.in);
        input = scan.nextInt();
        int ans = reverse_Number(input);
        System.out.println("Reverse Number"+ ans);
        System.out.println("final ans"+(input-ans));

        scan.close();
    }

    private static int reverse_Number(int a) {
        int reverse = 0;
        int rem;
        while (a != 0) {

            rem = a % 10;
            reverse = reverse * 10 + rem;
            a /= 10;

        }
        return reverse;

    }
}
