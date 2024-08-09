import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digitSum = 0;

        while (num > 0) {
            digitSum += num % 10;  // Add the last digit to digitSum
            num = num / 10;        // Remove the last digit from num
        }

        if (digitSum % 3 == 0) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
