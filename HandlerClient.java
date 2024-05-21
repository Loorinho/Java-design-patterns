public class HandlerClient {

      public static void main(String[] args) {
         IHandler handler = new BaseHandler();

         IHandler moderateHandler = new ModerateHandler();
         IHandler expertHandler = new ExpertHandler();

         handler.setNextHandler(moderateHandler);
         moderateHandler.setNextHandler(expertHandler);


         handler.handleRequest("moderate");
         System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

         handler.handleRequest("expert");
         System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

         handler.handleRequest("base");
      }
   
}
