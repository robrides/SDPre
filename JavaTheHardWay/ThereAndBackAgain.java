public class ThereAndBackAgain {
  public static void main(String[] args) {
    System.out.println("Here.");
    erebor(); // removing the parens causes an error during compile
    System.out.println("Back first time.");
    // erebor();
    System.out.println("Back second time.");
  }

  public static void erebor() {
    System.out.println("There.");
  }
}
