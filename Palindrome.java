import java.util.Scanner;
import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        boolean isPalindrome =
                IntStream.range(0, s.length() / 2)
                         .allMatch(i -> s.charAt(i) == s.charAt(s.length() - 1 - i));

        System.out.println(isPalindrome ? "PALINDROME" : "NOT PALINDROME");
    }
}
