import java.util.Scanner;

// Louis Sze
// Description of project
public class Main {

  public static void main(String[] args) {// special meaning, starting point of a program
    System.out.println("Welcome to my Ingegration Projet");
    System.out.println("Check out this cool stuff!");
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Variable");
    int a = scan.nextInt();
    System.out.println("Enter a double:");
    double b = scan.nextDouble();
    scan.nextLine();// when going from numbers to string, clear out buffer.
    System.out.println("Enter a Strinng:");
    String c = scan.nextLine();

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    
    //ctrl shift f automatic format
    // int int1 =2;
    // double double1 = 2.0;
    // String string1 = "2";

    /* Declare and initialize second integer, double, and String variables. */
    // int int2 =2;
    // double double2 = 2.0;
    // String string2 = "2";
    /* Print the sum of both integer variables on a new line. */
    // System.out.println(int1+int2);
    /* Print the sum of the double variables on a new line. */
    // System.out.println(double1+double2);
    /* Concatenate and print the string variable son a new line. */
    // System.out.println(string1+string2);
    
  }
  // }
  // class Clock{
  // fields
  // private int angleOfHourHand;
  // private int angleOfMinuteHand;

  // methods
  // public void tellTime() {

}
// }

// Going to number from string clear out the buffer
