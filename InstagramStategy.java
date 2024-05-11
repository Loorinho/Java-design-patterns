public class InstagramStategy implements ISocialMediaStrategy{

   @Override
   public void connectTo(String friendName) {
      System.out.println("Connecting with " + friendName + " through Instagram");
   }
   
}
