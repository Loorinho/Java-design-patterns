public class Singleton {
   private static Database database;

   private Singleton(Database d){ // provate so that we cant instantiate this singleton class
      database = d;
   }

   public static Database getInstance(){
      if(database == null){
         return new Database();
      }
      return database;
   }
   
}
