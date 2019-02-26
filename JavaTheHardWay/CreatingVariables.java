public class CreatingVariables {

    public static void main(String[] args) {

        int x, y, age, currentYear;
        double seconds, e, checking, savings;
        String firstName, middleName, lastName, title, dogName;

        x = 10;
        y = 400;
        age = 39;
        currentYear = 2019;
        seconds = 4.71;
        e = 2.71828182845904523536;
        checking = 1.89;
        savings = 100.01;

        firstName = "Graham";
        middleName = "Bell";
        lastName = "Mitchell";
        title = "Mr.";
        dogName = "Ruff";

        System.out.println("The variable x contains " + x);
        System.out.println("The value " + y + " is stored in the variable y.");
        System.out.println("The experiment took " + seconds + " seconds.");
        System.out.println("A favorite irrational # is Euler's number: " + e);
        System.out.println("Hopefully you have more than $" + checking
        + " in your checking and $" + savings + " in you savings!");
        System.out.println("My name's " + title + " " + firstName + middleName
        + lastName + " and my dog's name is " + dogName);
    }
}
