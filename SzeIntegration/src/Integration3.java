
public class Integration3 {
  
  public class DeckOfCard {
    private String suits;
    private String number;
    
    public DeckOfCard() {
      this(0.0);
    }
    public DeckOfCard(double d) {
      this(d,0);
    }
    public DeckOfCard(double d, int i) {
     
    }
    public String getSuits() {
      return suits;
    }
    public void setSuits(String suits) {
      this.suits = suits;
    }
    public String getNumber() {
      return number;
    }
    public void setNumber(String number) {
      this.number = number;//editted
    }

  }


}
