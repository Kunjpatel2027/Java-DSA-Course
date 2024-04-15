import java.util.Scanner;

public class Sunrise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of count : ");
        double count = sc.nextDouble();
        System.out.println("Enter length : ");
        double length = sc.nextDouble();
        double rate = 17.5;
        double cost = count * length * rate / 200;
        System.out.println("Cost =" + cost);

    }

}
