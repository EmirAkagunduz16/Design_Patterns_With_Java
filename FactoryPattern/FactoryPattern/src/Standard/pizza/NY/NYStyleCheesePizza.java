package Standard.pizza.NY;

import Standard.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza{

  @Override
  public void prepare() { System.out.println("Preparing NYCheese Pizza..."); }

  @Override
  public void bake() { System.out.println("Baking NYCheese Pizza..."); }
  
  @Override
  public void cut() { System.out.println("Cutting NYCheese Pizza..."); }

  @Override
  public void box() { System.out.println("Boxing NYCheese Pizza..."); }
}