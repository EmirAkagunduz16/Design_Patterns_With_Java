package Commands;

import Hardware.KitchenLigths;

public class KitchenLightsOnCommand implements Command{
  KitchenLigths kitchenLigths;

  public KitchenLightsOnCommand(KitchenLigths kitchenLigths){ this.kitchenLigths = kitchenLigths; }

  @Override
  public void execute(){ kitchenLigths.on(); }
}
