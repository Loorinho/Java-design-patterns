package behavioral.strategy;

public class SocialMediaContext {

      private ISocialMediaStrategy smStrategy;
   
      public void setSocialmediaStrategy(ISocialMediaStrategy smStrategy) {
         this.smStrategy = smStrategy;
      }
   
      public void connect(String friendName) {
         smStrategy.connectTo(friendName);
      }
   
}