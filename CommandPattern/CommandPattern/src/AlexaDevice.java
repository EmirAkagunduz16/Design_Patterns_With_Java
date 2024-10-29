import Commands.Command;
import Commands.NoOpsCommand;

public class AlexaDevice {
  Command[] onCommands;
  Command[] offCommands;
  int slots = 3;

  public AlexaDevice(){
    onCommands = new Command[slots]; 
    offCommands = new Command[slots]; 

    for (int i=0; i<slots; i++){
      onCommands[i] = new NoOpsCommand();
      offCommands[i] = new NoOpsCommand();
    }
  }

  public void setCommand(int slot, Command onCommand, Command offCommand){
    // slot between 0..2, neither commands can be null
    if (onCommand == null || offCommand == null){ throw new IllegalArgumentException("Commands cannot be null!"); }
    else {
      onCommands[slot] = onCommand;
      offCommands[slot] = offCommand;
    }
  }

  public void activateSlot(int slot){ onCommands[slot].execute(); }
  public void deActivateSlot(int slot){ offCommands[slot].execute(); }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("\n-------- Alexa Device Controller --------\n");
    for (int i = 0; i < slots; i++) {
      sb.append("Slot #" + i + " - " + onCommands[i].getClass().getSimpleName() + "(" + onCommands.getClass().getSimpleName() + ")" +
              " - " + offCommands[i].getClass().getSimpleName() + "(" + offCommands.getClass().getSimpleName() + ")" +
              "\n");
    }
    return sb.toString();
  }

}
