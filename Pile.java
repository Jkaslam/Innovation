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
  
  //Gets the color of the pile
  public Color getColor() {
    return color;
  }
  
  //Gets the current splay of the pile
  public Splay getSplay() {
    return splay;
  }
  
  //Adds a card to the pile if it is of the correct color
  public void addCard(Card c) {
    if (c.getColor() == color) {
      cards.add(c);
	}
	else {
	  throw new IllegalArgumentException("The card must be of the same color as the pile.");
	}
  }
  
  //Removes a card from the pile
  public void removeCard(Card c) {
    cards.remove(c);
  }
  
  //Removes a list of cards from the pile
  public void removeCards(ArrayList<Card> cardList) {
    for (int ct = 0; ct < cardList.size(); ct++) {
	  removeCard(cardList.get(ct));
	}
  }
  
  //Gets the number of symbols of a specific type visible in a pile 
  //taking the splay into account. 
  public int getNumSymbol(Symbol s) {
    int sum = 0;
	
	//Begins with the top card since cards get added to the end of the list
    for (int ct = cards.size() - 1; ct >= 0; ct--) {
	  cardSymbols = cards.get(i).getSymbols();
	  //If we are at the top card then we check all the symbols
	  if (ct == cards.size() - 1) {
	    for (Symbol symb : cardSymbols) {
		  //Only if the correct symbol
		  if (s == symb) {
		    sum++;
		  }
		}
		//No splay then only top card
		if (splay == Splay.NONE) {
		  return sum;
		}
	  }
	  else {
	    //If the card is splayed left then just the symbol visible
		//on the right side of the card
	    if (splay == Splay.LEFT) {
		  if (s == cardSymbols[3]) {
		    sum++;
		  }
		  return sum;
		}
		//If the card is splayed right then just the possibly two symbols
		//on the left of the card
		if (splay == Splay.RIGHT) {
		  for (int i = 0; i < 2; i++) {
		    if (s == cardSymbols[i]) {
			  sum++;
		    }
		  }
		  return sum;
		}
		//If the card is splayed up then all of the bottom three symbols
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
  
  //Splays the pile left
  public void splayLeft() {
    splay = Splay.LEFT;
  }
  
  //Splays the pile right
  public void splayRight() {
    splay = Splay.RIGHT;
  }
  
  //Splays the pile up
  public void splayUp() {
    splay = Splay.UP;
  }
  
  //Sets the pile's splay back to NONE
  public void unsplay() {
    splay = Splay.NONE;
  }
  
}

//The possible splays that the pile could have
public enum Splay {
NONE, LEFT, RIGHT, UP
}