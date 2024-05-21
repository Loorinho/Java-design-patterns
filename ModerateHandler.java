public class ModerateHandler extends BaseHandler{

      @Override
      public void handleRequest(String request) {
         if (request.equals("moderate")) {
               System.out.println("ModerateHandler handles the request");
         } else {
               super.handleRequest(request);
         }
      }
   
}
