import java.util.Scanner;

public class IncomeTaxCalculator {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Income: ");
        double income = sc.nextDouble();
        double tax;
        if (income < 53359) {
            tax = income * 0.1500;

        } else if (income >= 53359 && income < 106716) {
            tax = income * 0.2050;

        } else if (income >= 106716 && income < 165430) {
            tax = income * 0.2600;
        } else if (income >= 165430 && income < 235675) {
            tax = income * 0.2900;

        } else {
            tax = income * 0.3300;
        }

        System.out.println("Your Tax is :" + tax);

        double netincome = income - tax;
        System.out.println("Your Net Income is: " + netincome);
        double Monthly = income / 12;
        double perhour = Monthly / 160;
        System.out.println("Your Monthly net income is : " + Monthly);
        System.out.println("per hour :" + perhour);

    }
}
