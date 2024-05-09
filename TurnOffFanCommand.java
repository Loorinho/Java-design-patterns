public class TurnOffFanCommand implements Command{

   private Fan fan;

   public TurnOffFanCommand(Fan fan) {
      this.fan = fan;
   }

   @Override
   public void execute() {
      System.out.println("Turning off fan");
      fan.turnOff();
   }
   
}
