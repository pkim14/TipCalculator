import java.text.DecimalFormat;

public class TipCalculator {
    private double totalBill;
    private int tipPercent;
    private int numPeople;
    private DecimalFormat df = new DecimalFormat("0.00");

    public TipCalculator(double totalBill, int tipPercent, int numPeople) {
        this.totalBill = totalBill;
        this.tipPercent = tipPercent;
        this.numPeople = numPeople;
    }

    public double calculateTotalTip() {
        return (tipPercent / 100.0) * totalBill;
    }

    public double calculateTotalWithTip() {
        return totalBill + calculateTotalTip();
    }

    public double calculateTipPerPerson() {
        return calculateTotalTip() / numPeople;
    }

    public double calculateTotalPerPerson() {
        return calculateTotalWithTip() / numPeople;
    }

    public void printBillDetails() {
        System.out.println("----------------------------------");
        System.out.println("Total Tip Amount: $" + df.format(calculateTotalTip()));
        System.out.println("----------------------------------");

        System.out.println("Total Bill Cost: $" + df.format(calculateTotalWithTip()));
        System.out.println("----------------------------------");

        System.out.println("Tip Per Person: $" + df.format(calculateTipPerPerson()));
        System.out.println("----------------------------------");

        System.out.println("Total Bill Per Person: $" + df.format(calculateTotalPerPerson()));
        System.out.println("----------------------------------");
    }
}
