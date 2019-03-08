import java.util.Scanner;

public class TriangleType {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("\n\t\tWelcome to Triangle Typer!\n\n" +
    "This program will determine if a Triangle is either Equilateral," +
    " Isosceles, or Right.\n\n" +
    "Enter the integer lengths of the 3 sides of the triangle, one at a time:\n");
    int s1 = input.nextInt();
    int s2 = input.nextInt();
    int s3 = input.nextInt();

    System.out.println("\nYour triangle type is: " + solveTriangle(s1, s2, s3));
  }

  public static String solveTriangle(int s1, int s2, int s3) {
    if (s1 == s2 && s1 == s3){
    return "Equilateral";
    } else if (s1 == s2 || s2 == s3 || s1 == s3){
    return "Isosceles";
    } else if ((s1 * s1) + (s2 * s2) == (s3 * s3)) {
    return "Right";
    } else if ((s2 * s2) + (s3 * s3) == (s1 * s1)) {
    return "Right";
    } else if ((s1 * s1) + (s3 * s3) == (s2 * s2)) {
    return "Right.";
    } else {
    return "None of these.";
    }
  }

}
