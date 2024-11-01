public class App {
    public static void main(String[] args) throws Exception {
      Coffee espresso = new Espresso();
      printCoffee(espresso);

      espresso = new WithMilk(espresso);
      printCoffee(espresso);
      
      espresso = new WithSugar(espresso);
      espresso = new WithSugar(espresso);
      printCoffee(espresso);
      

    }

    private static void printCoffee(Coffee c){
      System.out.println("Cost: " + c.cost() + ", Description: " + c.getDescription());
    }
}
