public class HomeAutomationRemote {

   //Command interface reference.
   private Command command;

   //Set the command in runtime to trigger.
   public void setCommand(Command command){
      this.command = command;
   }

   //Will call the command interface method so that particular command can be invoked.
   public void pressButton(){
      command.execute();
   }

   
}
