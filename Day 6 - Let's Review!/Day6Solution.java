import java.util.Scanner;

/**
 * Created by lisbethk on 30.09.2017.
 */
public class Day6Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        in.nextLine();

        for (int i = 0; i < n; i++) {
            String word = in.nextLine();
            char[] chars = word.toCharArray();

            for (int j = 0; j < chars.length; j+=2) {
                System.out.print(chars[j]);
            }
            System.out.print(" ");

            for (int j = 1; j < chars.length; j+=2) {
                System.out.print(chars[j]);
            }
            System.out.println();
        }
        in.close();
    }
}
