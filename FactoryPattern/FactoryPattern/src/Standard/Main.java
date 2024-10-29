package Standard;

import Standard.pizza.Pizza;
import Standard.store.NYPizzaStore;
import Standard.store.PizzaStore;

public class Main {
  @SuppressWarnings("unused")
  public static void main(String[] args) {
    PizzaStore nyPizzaStore = new NYPizzaStore();
    Pizza pepperoniPizza = nyPizzaStore.orderPizza("pepperoni");
  }
}
