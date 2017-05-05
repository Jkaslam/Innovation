import java.util.ArrayList;

/*
* Represents a pile of cards in front of a player in Innovation. Piles are separated by color. 
*/ 
public class Pile {
  private Color color;
  private Splay splay;
  private ArrayList<Card> cards;
  
  public Pile(Color color) {
    this.color = color;
	splay = Splay.NONE;
	cards = new ArrayList<Card>();
  }
  
  //Returns the list of Cards in a pile
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
  
  public int getNumSymbol(Symbol s) {
    int sum = 0;
    for (int ct = cards.size() - 1; ct >= 0; ct--) {
	  cardSymbols = cards.get(i).getSymbols();
	  if (ct == cards.size() - 1) {
	    for (Symbol symb : cardSymbols) {
		  if (s == symb) {
		    sum++;
		  }
		}
		if (splay == Splay.NONE) {
		  return sum;
		}
	  }
	  else {
	    if (splay == Splay.LEFT) {
		  if (s == cardSymbols[3]) {
		    sum++;
		  }
		  return sum;
		}
		if (splay == Splay.RIGHT) {
		  for (int i = 0; i < 2; i++) {
		    if (s == cardSymbols[i]) {
			  sum++;
		    }
		  }
		  return sum;
		}
		if (splay == Splay.UP) {
		  for (int i = 1; i < cards.size(); i++) {
		    if (s == cardSymbols[i]) {
			  sum++;
			}
		  }
		  return sum;
		}
	  }
	}
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