import Commands.EverythingOffCommand;
import Commands.EverythingOnCommand;
import Commands.KitchenLightsOffCommand;
import Commands.KitchenLightsOnCommand;
import Hardware.KitchenLigths;
import Hardware.Music;

public class App {
    public static void main(String[] args) throws Exception {
        //Example 1 - Empty Slots
        AlexaDevice alexa = new AlexaDevice();
        System.out.println(alexa);
        

        // Example 2 -Kitchen Ligths on
        //AlexaDevice alexa = new AlexaDevice();

        // Create an instance
        KitchenLigths kitchenLigths = new KitchenLigths();

        // Set slots with new Commands
        alexa.setCommand(
          0,
          new KitchenLightsOnCommand(kitchenLigths),
          new KitchenLightsOffCommand(kitchenLigths)
        );

        System.out.println(alexa);

        alexa.activateSlot(0);
        alexa.deActivateSlot(0);


        //Example 3 - Everything on!
        //AlexaDevice alexa = new AlexaDevice();
        
        // Create instance
        //KitchenLigths kitchenLigths = new KitchenLigths();
        Music music = new Music();

        // Set slots with new Commands
        alexa.setCommand(
          1,
          new EverythingOnCommand(music, kitchenLigths),
          new EverythingOffCommand(music, kitchenLigths)
        );
        
        System.out.println(alexa);
        
        alexa.activateSlot(1);
        alexa.deActivateSlot(1);
        
        
        
        
        
    }
}
