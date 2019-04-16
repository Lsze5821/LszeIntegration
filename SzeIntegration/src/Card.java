import java.util.Random;

// Louis Sze
public class Card {
  public static final int DIAMOND = 0;
  public static final int SPADE = 0;
  private String suit;
  private int number;

  public Card(int suit2, int rank) {
   
  }

  public String getSuit() {
    return suit;
  }

  public void setSuit(String suiteToBeSet) {
    suit = suiteToBeSet;
  }

  public void draw() {
    Random randomGen = new Random();
    int suitNum = randomGen.nextInt();
    if (suitNum == 0) {
      suit = "Diamonds"; // could be random
    } else if (suitNum == 1) {
      suit = "clubs";// could be random
    } else if (suitNum == 2) {
      suit = "Spades";// could be random
    } else if (suitNum == 3) {
      suit = "Hearts";// could be random
    } else {
      System.out.println("Uh Oh");

    }
    number = Math.abs(randomGen.nextInt() % 13);// could be random



  }
}
