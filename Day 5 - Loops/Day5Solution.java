/**
 * Created by lisbethk on 29.09.2017.
 */
import java.util.*;

public class Day5Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        for (int i = 1; i < 11; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}