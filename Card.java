import java.util.function.Function;

public class Card {
  private String name;
  private Color color;
  private Symbol[] symbols;
  private Function[] dogmaEffects;
 
  public Card(String name, Symbol[] symbols, Function[] dogmaEffects) {
    name = name;
	symbols = symbols;
	dogmaEffects = dogmaEffects; 
  }
  
  public Color getColor() {
    return color;
  }
  
  public String getName() {
    return name;
  }
  
  public void dogma() {
    for (Function f : dogmaEffects) {
	  f.apply(this);
	}
  }
  
}

public enum Color {
RED, YELLOW, GREEN, BLUE, PURPLE
}

public enum Symbol {
CASTLE, LIGHTBULB, LEAF, CROWN, FACTORY, CLOCK, NOTHING
}