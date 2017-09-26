import java.util.Scanner;

public class Day2Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;
        double totalCostToRound = tip + tax + mealCost;

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(totalCostToRound);

        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
