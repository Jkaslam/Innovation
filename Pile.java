import java.util.ArrayList;

public class Pile {
  private Color color;
  private Splay splay;
  private ArrayList<Card> cards;
  
  public Pile(Color color) {
    this.color = color;
	splay = Splay.NONE;
	cards = new ArrayList<Card>();
  }
  
  public ArrayList<Card> getCards() {
    return cards;
  }
  
  public Color getColor() {
    return color;
  }
  
  public Splay getSplay() {
    return splay;
  }
  
  public void addCard(Card c) {
    cards.add(c);
  }
  
  public void splayLeft() {
    splay = Splay.LEFT;
  }
  
  public void splayRight() {
    splay = Splay.RIGHT;
  }
  
  public void splayUp() {
    splay = Splay.UP;
  }
  
  

}

public enum Splay {
NONE, LEFT, RIGHT, UP
}