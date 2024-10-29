import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
      
      // Create the data object (publisher / topic)
      WheatherStation wheatherStation = new WheatherStation();

      // Create and register our displays (observers / subscribers)
      CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(wheatherStation);
      ForecastDisplay forecastDisplay = new ForecastDisplay(wheatherStation);

      // Simulate updates
      for(int i=0; i<5; i++){
        System.out.println("\n--- Update " + i + "-----");
        
        int randomTemp = getRandomInt(-50, 40);
        int randomHumidity = getRandomInt(0, 100);

        wheatherStation.measurementsChanged(randomTemp, randomHumidity);
        
        Thread.sleep(1000);
      }
    }

    public static int getRandomInt(int min, int max){
      Random rand = new Random();
      return rand.nextInt(max + 1 - min) + min;
    }
}
