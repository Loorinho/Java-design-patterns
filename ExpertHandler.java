public class ExpertHandler extends BaseHandler {

      @Override
      public void handleRequest(String request) {
         if (request.equals("expert")) {
               System.out.println("ExpertHandler handles the request");
         } else {
               super.handleRequest(request);
         }
      }
   
}
