public interface IHandler {
      void handleRequest(String request);
      void setNextHandler(IHandler handler);
}
