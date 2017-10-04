import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by lisbethk on 29.09.2017.
 */
public class Day9Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
    public static int factorial(int n) {
        if (n == 1) return n;
        else return n * factorial(n - 1);
    }
}
