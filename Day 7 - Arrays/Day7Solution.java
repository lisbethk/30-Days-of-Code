import java.util.Scanner;

/**
 * Created by lisbethk on 01.10.2017.
 */
public class Day7Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }

        in.close();

        for(int i=arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
