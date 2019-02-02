import java.util.Scanner;

// Louis Sze
// Description of project not quite decided, for now its some exercises.
public class Main {

  public static void main(String[] args) {// special meaning, starting point of a program
    System.out.println("Welcome to my Ingegration Projet");
    System.out.println("Check out this cool stuff!");
    // Byte - is a 8 bit integer, with a minimum value and maximum value of 127
    // Short - is a 16 bit integer, with a minimum value of -32,768 and max 32,767
    // Int - is a 32 bit integer, with a minimum -2e-31 and a max of 2e-31-1
    // Long - is a 64 bit integer, with a minimum value of -2e-63 and a max of 2e64-1
    // Float - is a single precision 32 bit IEEE754 
    // Double - is a 64 bit IEEE754
    // Char - a single 16 bit unicode character, with a minimum value of '\u0000'(0) and a max value of '\uffff' (65,535)
 
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Integer");
    int a = scan.nextInt();
    System.out.println("Enter a Double:");
    double b = scan.nextDouble();
    scan.nextLine();// when going from numbers to string, clear out buffer.
    System.out.println("Enter a String:");
    String c = scan.nextLine();

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    
    //variable or an object or an integer being declared.
    //scope is a variable accessible in area its declared.
    //final variable is a variable that can't be changed
    //Casting is going from one data type to another
    
//    ctrl shift f- automatic format
//     int int1 =2;// integer storing  a int variable
//     double double1 = 2.0; //double is integer on the left and the right of the decimal
//     String string1 = "2"; // storing a variable or an object as a string.
//
//    /* Declare and initialize second integer, double, and String variables. */
//     int int2 =2;
//     double double2 = 2.0;
//     String string2 = "2";
//    /* Print the sum of both integer variables on a new line. */
//     System.out.println(int1+int2);
//    /* Print the sum of the double variables on a new line. */
//     System.out.println(double1+double2);
//    /* Concatenate and print the string variable son a new line. */
//     System.out.println(string1+string2);
    
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
