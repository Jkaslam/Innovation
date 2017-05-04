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
  
  public int getScore() {
    int score = 0;
	for (card : scorePile) {
	  score += card.getAge();
	}
	
	return score;
  }
  
  public int getNumAchievements() {
    return achievements.size();
  }
  
  public Map<Symbol, Integer> getNumSymbols() {
    computeNumSymbols();
    return numSymbols;
  }
  
  public ArrayList<Card> getHand() {
    return hand;
  }
  
  private void computeNumSymbols() {
    for (Symbol symb: Symbol.values()) {
	  numSymbols[symb] = 0;
	}
	
    for (Color color : Color.values()) {
	  for (Symbol symb : Symbol.values()) {
	    numSymbols[symb] += piles[color].getNumSymbol(symb);
	  }
	}
  }
}