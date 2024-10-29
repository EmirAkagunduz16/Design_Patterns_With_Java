package Commands;

import Hardware.KitchenLigths;
import Hardware.Music;

public class EverythingOffCommand implements Command {
    Music music;
    KitchenLigths kitchenLights;

    public EverythingOffCommand(Music music, KitchenLigths kitchenLights) {
        this.music = music;
        this.kitchenLights = kitchenLights;
    }

    @Override
    public void execute() {
        System.out.println("\n--- PARTY TIME OVER! ---\n");
        kitchenLights.off();
        music.off();
        music.setVolume(0);
        music.setStation(0);
    }

}
