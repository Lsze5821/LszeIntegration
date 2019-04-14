
public class Integration3 {
  //Louis Sze
  public class DeckOfCard {
    private String suits; //private class suits
    private String number; //private class numbers for the card
    
    public DeckOfCard() { //constructor with no parameters
      this(0.0);
    }
    public DeckOfCard(double d) { //constructor with single parameters
      this(d,0);
    }
    public DeckOfCard(double d, int i) {
     
    }
    public String getSuits() { //gets suits
      return suits;
    }
    public void setSuits(String suits) { //set suits
      this.suits = suits;
    }
    public String getNumber() { //gets number
      return number;
    }
    public void setNumber(String number) { //sets number 
      this.number = number;
    }

  }


}
