import java.util.function.Function;

public class Card {
  private String name;
  private Color color;
  private int age; 
  private Symbol[] symbols;
  private Function[] dogmaEffects;
 
  public Card(String name, Color color, int age, Symbol[] symbols, Function[] dogmaEffects) {
    this.name = name;
	this.color = color;
	this.age = age;
	this.symbols = symbols;
	this.dogmaEffects = dogmaEffects; 
  }
  
  public String getName() {
    return name;
  }
  
  public Color getColor() {
    return color;
  }
  
  public int getAge() {
    return age;
  }
  
  public Symbol[] getSymbols() {
    return symbols;
  }
  
  public void dogma() {
    for (Function f : dogmaEffects) {
	  f.apply(this);
	}
  }
  
  public String toString() {
    return "Age: " + string.valueOf(getAge()) + "Name: " + getName() + "Color: " + color.toString() + "\n";
  }
  
}

public enum Color {
RED, YELLOW, GREEN, BLUE, PURPLE
}

public enum Symbol {
CASTLE, LIGHTBULB, LEAF, CROWN, FACTORY, CLOCK, NOTHING
}