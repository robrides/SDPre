import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double m, kg, bmi, f, in, lbs, temp;


        /*
        System.out.print("Your height in m: ");
        m = keyboard.nextDouble();

        System.out.print("Your weight in kg: ");
        kg = keyboard.nextDouble();
        */
        System.out.print("Your height (feet only): ");
        f = keyboard.nextDouble();

        System.out.print("Your height (inches): ");
        in = keyboard.nextDouble();

        // System.out.print("Your height in inches: ");
        // in = keyboard.nextDouble();

        System.out.print("Your weight in pounds: ");
        lbs = keyboard.nextDouble();

        // 1 inch = 0.0254 meters; divide 1 inch by 39.37 to get meters
        // 1 pound = 0.453592 kilograms; divide 1 pound by 2.205 to get kilos

        temp = f * 12 + in;
        m = temp / 39.37;
        kg = lbs / 2.205;
        bmi = kg / (m*m);

        System.out.println("Your BMI is " + bmi);
    }
}
