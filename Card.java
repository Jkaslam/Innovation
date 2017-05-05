import java.util.function.Function;

/*
* Represents a card in Innovation which has a name, color, symbols, age and dogma effects. 
*/
public class Card {
  private String name;
  private Color color;
  private int age; 
  
  //From top left to bottom right
  private Symbol[] symbols;
  private Function[] dogmaEffects;
 
  public Card(String name, Color color, int age, Symbol[] symbols, Function[] dogmaEffects) {
    this.name = name;
	this.color = color;
	this.age = age;
	this.symbols = symbols;
	this.dogmaEffects = dogmaEffects; 
  }
  
  //Gets the name of the card
  public String getName() {
    return name;
  }
  
  //Gets the color of the card
  public Color getColor() {
    return color;
  }
  
  //Gets the age of the card
  public int getAge() {
    return age;
  }
  
  //Gets the list of symbols on the card
  public Symbol[] getSymbols() {
    return symbols;
  }
  
  //Enacts the dogma effects of the card
  public void dogma() {
    for (Function f : dogmaEffects) {
	  f.apply(this);
	}
  }
  
  //Checks if two cards are equal
  public boolean equals(Card c) {
    return name.equals(c.getName());
  }
  
  //The hashvalue of the object
  public int hashCode() {
    return name.hashCode();
  }
  
  //Prints out the important information of the card
  public String toString() {
    return "Age: " + string.valueOf(getAge()) + "Name: " + getName() + "Color: " + color.toString() + "\n";
  }
  
}

//All possible colors of the card
public enum Color {
RED, YELLOW, GREEN, BLUE, PURPLE
}

//All possible symbols on a card
public enum Symbol {
CASTLE, LIGHTBULB, LEAF, CROWN, FACTORY, CLOCK, NOTHING
}