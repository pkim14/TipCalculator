import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("------------------------------------------------------------------");
        System.out.println("| Do not use any symbols when inputting data please! (No $ or %) |");
        System.out.println("------------------------------------------------------------------");

        System.out.print("Enter your bill ($): ");
        String bill = s.nextLine();
        System.out.print("Tip Percent: ");
        String tip = s.nextLine();
        System.out.print("Number of People: ");
        String people = s.nextLine();
        System.out.println();

        final double totalBill = Double.parseDouble(bill);
        final int tipPercent = Integer.parseInt(tip);
        final int numPeople = Integer.parseInt(people);

        TipCalculator calculator = new TipCalculator(totalBill, tipPercent, numPeople);
        calculator.printBillDetails();

        s.close();
    }
}
