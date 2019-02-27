import java.util.Scanner;

public class RudeQuestions {
    public static void main(String[] args) {
        String name;
        int age;
        double weight, income;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hello. What is your name? ");
        name = keyboard.next();

        System.out.print("Hi, " + name + "! How old are you? ");
        age = keyboard.nextInt();

        System.out.println("So you're " + age + ", eh? That's not very old.");
        System.out.print("How much do you weigh, " + name + "? ");
        weight = keyboard.nextDouble();

        System.out.println(weight + "! Better keep that quiet!!");
        System.out.print("Finally, what's your income, " + name + "? ");
        income = keyboard.nextDouble();

        System.out.print("Hopefully that is " + income + " per hour");
        System.out.println(" and not per year!");
        System.out.print("Well, thanks for answering my rude questions, ");
        System.out.println(name + ".");

        // Study Drills
        // 1. The program doesn't blow up if you enter an int where the program
        // accepts a double because Java accepts values with or without decimal
        // as doubles but stores the int with a '.0'.
        // 2. The program doesn't blow up if you enter a number when it expects
        // a String, Java just stores the input as a String but you won't
        // be able to perform math on that value as it is a String.
        // 3. For the first question nothing will make the program blow up
        // as it just stores it as a String.  The second question blows up if
        // you type letters instead of numbers because Java is expecting an
        // interger value. The third and fourth questions blow up if you enter
        // a special character like '*' as it is expecting a double (or
        // interger) value. 
    }
}
