import java.util.Scanner;

// Louis Sze
public class Introduction {
  public void Intro() {
    System.out.print("Welcome to my Integration Project\n");// \n creates a new line
    System.out.print("Programs that follow PSI 1 2 & 3\n");

    Scanner input = new Scanner(System.in); // Scanner to allow user input
    System.out.println("Whats your name?");// Asks user for name
    String username = input.next();// Stores the next input variable as a String
    System.out.println("Welcome " + username + "!");// Greets the User
    
   //input.close();//Closes the scanner input
    
    /*
     * Byte - is a 8 bit integer, with a minimum value and maximum value of 127 Short - is a 16 bit
     * integer, with a minimum value of -32,768 and max 32,767 Int - is a 32 bit integer, with a
     * minimum -2e-31 and a max of 2e-31-1 Long - is a 64 bit integer, with a minimum value of
     * -2e-63 and a max of 2e64-1 Float - is a single precision 32 bit IEEE754 Double - is a 64 bit
     * IEEE754 Char - a single 16 bit unicode character, with a minimum value of '\u0000'(0) and a
     * max value of '\uffff' (65,535)
     */
  }

}
