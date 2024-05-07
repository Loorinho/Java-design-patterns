public abstract class House {

   public final void buildHouse(){
      buildFoundation();
      buildPillars();
      buildWalls();
      buildWindows();
      buildRoof();
      System.out.println("House is built.");
   }

   private void buildFoundation() {
      System.out.println("Building foundation with cement, iron rods and sand");
   }

   private void buildRoof() {
      System.out.println("Building house roof");
   }

   public abstract void buildWalls();
   public abstract void buildPillars();
   public abstract void buildWindows();

}
