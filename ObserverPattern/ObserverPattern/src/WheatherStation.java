import java.util.ArrayList;
import java.util.List;

public class WheatherStation implements Subject{
  
  private List<Observer> observers;
  private int temp;
  private int humidity;

  public WheatherStation() { this.observers = new ArrayList<>(); }

  @Override
  public void registerObserver(Observer o) { observers.add(o); }  

  @Override 
  public void removeObserver(Observer o) {
    int observerIndex = observers.indexOf(o); //Do i have this observer?
    if (observerIndex >= 0)
      observers.remove(observerIndex);
  }

  @Override
  public void notifyObservers() { observers.forEach((o -> o.update(temp, humidity))); }

  public void measurementsChanged(int temp, int humidity){
    this.temp = temp;
    this.humidity = humidity;
    notifyObservers();
  }
  
}
