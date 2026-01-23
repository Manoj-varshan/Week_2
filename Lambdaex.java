import java.util.Scanner;

interface PerformOperation {
    boolean check(int n);
}

public class Lambdaex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        // lambdas (functions)
        PerformOperation isOdd = n -> n % 2 != 0;

        PerformOperation isPrime = n -> {
            if (n <= 1) return false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        PerformOperation isPalindrome = n -> {
            int rev = 0, temp = n;
            while (temp > 0) {
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }
            return rev == n;
        };

        while (T-- > 0) {

            int type = sc.nextInt();
            int num = sc.nextInt();

            if (type == 1) {
                System.out.println(isOdd.check(num) ? "ODD" : "EVEN");
            }
            else if (type == 2) {
                System.out.println(isPrime.check(num) ? "PRIME" : "COMPOSITE");
            }
            else if (type == 3) {
                System.out.println(isPalindrome.check(num) ? "PALINDROME" : "NOT PALINDROME");
            }
        }
    }
}
