public class Client {

   public static void main(String[] args) {
      Fan fan = new Fan();
      Light light = new Light();
      
      Command turnOnFanCommand = new TurnOnFanCommand(fan);
      Command turnOffFanCommand = new TurnOffFanCommand(fan);
      
      Command turnOnLightCommand = new TurnOnLightCommand(light);
      Command turnOffLightCommand = new TurnOffLightCommand(light);
      
      HomeAutomationRemote remoteControl = new HomeAutomationRemote();
      
      remoteControl.setCommand(turnOnFanCommand);
      remoteControl.pressButton();

      System.out.println("**************************************");

      remoteControl.setCommand(turnOffFanCommand);
      remoteControl.pressButton();

      System.out.println("**************************************");

      remoteControl.setCommand(turnOnLightCommand);
      remoteControl.pressButton();

      System.out.println("**************************************");

      remoteControl.setCommand(turnOffLightCommand);
      remoteControl.pressButton();



      
     
   }
   
}
