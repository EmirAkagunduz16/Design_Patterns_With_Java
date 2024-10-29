public class Rocketship{

  // Class level static instance
  private static volatile Rocketship rocketship;

  // private Constructor to prevent multiple instances
  private Rocketship() {}

  // Fcatory method to retrieve the instance
  public static Rocketship getInstance(){
    if (rocketship==null) {  synchronized (Rocketship.class) { rocketship = new Rocketship(); } }
    return rocketship;  
  }

}