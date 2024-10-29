public class Espresso extends Coffee{

  public Espresso(){ description = "Espresso"; }

  public int a;
  public void deneme() {this.a=10;}
  
  @Override
  public double cost() { return 1.99; }
  
}
