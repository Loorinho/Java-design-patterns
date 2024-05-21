public class BaseHandler implements IHandler{
      private IHandler nextHandler;
   
      @Override
      public void setNextHandler(IHandler handler) {
         this.nextHandler = handler;
      }
   
      @Override
      public void handleRequest(String request) {
         if (nextHandler != null) {
               nextHandler.handleRequest(request);
         }
      }
   
}
