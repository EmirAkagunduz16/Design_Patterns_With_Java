package Commands;

import Hardware.KitchenLigths;

public class KitchenLightsOffCommand implements Command{
  KitchenLigths kitchenLigths;

  public KitchenLightsOffCommand(KitchenLigths kitchenLigths){ this.kitchenLigths = kitchenLigths; }

  @Override
  public void execute(){ kitchenLigths.off(); }
}
