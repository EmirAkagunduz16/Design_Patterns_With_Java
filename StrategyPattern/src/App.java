public class App {
    public static void main(String[] args) throws Exception {
      FlyBehaviour flyWithWings = new FlyWithWings();
      Duck mallarDuck = new MallardDuck(flyWithWings);

      mallarDuck.performFly();
      
    }
}
