public class Adapter implements ClientInterface {

   private ThirdPartyService service;

   public Adapter(ThirdPartyService s){
      this.service = s;
   }

   @Override
   public void method(String dataToConvert) {

      String convertedData = convertXMLToJSON(dataToConvert);
      service.serviceMethod(convertedData); 
   }

    public String convertXMLToJSON(String data){
      System.out.println("Data conversion to xml started"); 
      System.out.println("Data to convert is: " +data); 
      System.out.println("Data conversion done");
   
      return "Returned converted json data for ".concat(data);
      
   }

   
}
