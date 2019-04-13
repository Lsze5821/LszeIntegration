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
  }

}
