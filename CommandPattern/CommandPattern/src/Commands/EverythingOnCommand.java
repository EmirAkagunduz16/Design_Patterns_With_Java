package Commands;

import Hardware.KitchenLigths;
import Hardware.Music;

public class EverythingOnCommand implements Command{
    Music music; 
    KitchenLigths kitchenLigths;

    public EverythingOnCommand(Music music, KitchenLigths kitchenLigths){
      this.music = music;
      this.kitchenLigths = kitchenLigths;
    }

    @Override
    public void execute(){
      System.out.println("---It is Party Time!---");
      kitchenLigths.on();
      music.on();
      music.setVolume(10);
      music.setStation(102.1F);
    }
}
