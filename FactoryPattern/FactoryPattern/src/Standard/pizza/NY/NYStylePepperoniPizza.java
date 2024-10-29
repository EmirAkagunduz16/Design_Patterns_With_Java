package Standard.pizza.NY;

import Standard.pizza.Pizza;

public class NYStylePepperoniPizza extends Pizza{

  @Override
  public void prepare() { System.out.println("Preparing NYPepperoni Pizza..."); }

  @Override
  public void bake() { System.out.println("Baking NYPepperoni Pizza..."); }
  
  @Override
  public void cut() { System.out.println("Cutting NYPepperoni Pizza..."); }

  @Override
  public void box() { System.out.println("Boxing NYPepperoni Pizza..."); }
}
