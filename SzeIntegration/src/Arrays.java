// Louis Sze
public class Arrays {
  public class FiftyTwoCards {
    public static final int CARDS = 52;
    private Card[] fiftyTwoCards;

    public FiftyTwoCards() {
      fiftyTwoCards = new Card[CARDS];
      int i = 0;
      for ( int suit = Card.DIAMOND; suit <= Card.SPADE; suit++ )           
        for ( int rank = 1; rank <= 13; rank++ )
        fiftyTwoCards[i++] = new Card(suit, rank);
    }
  }
}
