public class Client {
   public static void main(String[] args) {
      ThirdPartyService service = new ThirdPartyService(); // third party service object

      ClientInterface client = new Adapter(service); // client talking to the adapter to use some method of the third party service

      client.method("Blue pen");
   }
}
