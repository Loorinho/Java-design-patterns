public class Client {

      public static void main(String[] args) {
         SocialMediaContext context = new SocialMediaContext();
         context.setSocialmediaStrategy(new FacebookStrategy());
         context.connect("Loorinho");

         System.out.println("==============================================");
   
         context.setSocialmediaStrategy(new InstagramStategy());
         context.connect("Loorinho");
      }
   
}
