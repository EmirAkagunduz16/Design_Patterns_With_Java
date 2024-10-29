package Standard.store;

import Standard.pizza.Pizza;
import Standard.pizza.NY.NYStyleCheesePizza;
import Standard.pizza.NY.NYStylePepperoniPizza;

public class NYPizzaStore extends PizzaStore{
  
  @Override
  protected Pizza createPizza(String type){
    if (type.equals("cheese")) { return new NYStyleCheesePizza(); }
    else if (type.equals("pepperoni")) { return new NYStylePepperoniPizza(); }
    else { return null; }
  }
  
}

