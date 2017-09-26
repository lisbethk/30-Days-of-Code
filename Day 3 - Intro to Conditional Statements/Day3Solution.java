import java.util.Scanner;

/**
 * Created by lisbethk on 26.09.2017.
 */
public class Day3Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if((n >= 6 && n <= 20) || n%2 != 0){
            ans = "Weird";
        }
        else if (n % 2 == 0 && n >= 2 && n <= 5 || n > 20){
            ans = "Not Weird";
        }
        System.out.println(ans);
    }
}
