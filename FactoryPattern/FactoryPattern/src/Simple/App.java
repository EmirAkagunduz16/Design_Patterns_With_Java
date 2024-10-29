package Simple;
public class App {
    public static void main(String[] args) throws Exception {
      SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
      Pizza pepperoniPizza = simplePizzaFactory.makePizza("pepperoni");
    }
}

abstract class Pizza{}

class PepperoniPizza extends Pizza{}

class CheesePizza extends Pizza{}


class SimplePizzaFactory{
  public Pizza makePizza(String pizzaType){ //Nothing wrong this - but it violate
    if (pizzaType.equals("pepperoni")){ return new PepperoniPizza(); }
    else if (pizzaType.equals("cheese")){ return new CheesePizza(); }
    else { return null; }
  }
}


