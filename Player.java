/*
* Represents a player in an innovation game who has piles of cards in front of them,
* a hand, a certain number of achievements and a score pile. 
*/
public class Player {
  private String name;
  private Map<Color, Pile> piles;
  private Map<Symbol, Integer> numSymbols;
  private ArrayList<Card> hand;
  private ArrayList<Card> scorePile;
  private ArrayList<Achievement> achievements;
  
  public Player(String name) {
    this.name = name;
	piles = new Hashtable<Color, Pile>;
	numSymbols = new Hashtable<Symbol, Integer>;
	scorePile = new ArrayList<Card>();
	achievements = new ArrayList<Achievement>();
  }
  
  //Gets the current score of the player by summing together
  //the ages of the cards in the scorepile. 
  public int getScore() {
    int score = 0;
	for (card : scorePile) {
	  score += card.getAge();
	}
	
	return score;
  }
  
  //Adds a card to the scorepile
  public void addScore(Card c) {
    scorePile.add(c);
  }
  
  //Gets the current number of achievements that the player has.
  public int getNumAchievements() {
    return achievements.size();
  }
  
  //Recomputes the number of symbols that this player has of all kinds
  //and returns a hashtable mapping symbols to the number of that symbol
  //that the player has. 
  public Map<Symbol, Integer> getNumSymbols() {
    computeNumSymbols();
    return numSymbols;
  }
  
  //Returns the list of cards in the player's hand
  public ArrayList<Card> getHand() {
    return hand;
  }
  
  //Updates the numSymbols field
  private void computeNumSymbols() {
    //Resets the number of symbols for each symbol to zero
    for (Symbol symb: Symbol.values()) {
	  if (symb != Symbol.NOTHING) {
	    numSymbols[symb] = 0;
	  }
	}
	
	//Loops through the different colored piles
    for (Color color : Color.values()) {
	  //For each pile check each symbol individually and update the number accordingly
	  for (Symbol symb : Symbol.values()) {
	    numSymbols[symb] += piles[color].getNumSymbol(symb);
	  }
	}
  }
}