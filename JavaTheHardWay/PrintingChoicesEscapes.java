public class PrintingChoicesEscapes {
    public static void main(String[] args) {
        System.out.print("Alpha\nBravo\nCharlie\nDelta\n\nEchoFoxtrotGolf\n"
        + "Hotel\nIndia\n\nThis is a test.\r\nI am learning Java the Hard Way!");
        // Had to use \r\n before last sentence as \n put a space before the 'I'
        // ...Windows, go figure.
        /*
        System.out.println("Alpha");
        System.out.println("Bravo");

        System.out.println("Charlie");
        System.out.println("Delta");
        System.out.println();

        System.out.print("Echo");
        System.out.print("Foxtrot");

        System.out.println("Golf");
        System.out.print("Hotel");
        System.out.println();
        System.out.println("India");

        System.out.println();
        System.out.println("This" + " " + "is" + " " + "a" + " test.");
        System.out.print("I am" + " learning" + " Java the" + " Hard Way!");
        */
    }
}
