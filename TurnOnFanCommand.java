public class TurnOnFanCommand implements Command{

   private Fan fan;

   public TurnOnFanCommand(Fan fan) {
      this.fan = fan;
   }

   @Override
   public void execute() {
      System.out.println("Turning on fan");
      fan.turnOn();
   }
   
}
