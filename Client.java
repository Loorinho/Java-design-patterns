public class Client {
   public static void main(String[] args) {
      
     Database db = Singleton.getInstance();

     db.connect();
   }
}
