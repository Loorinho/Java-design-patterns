import java.util.ArrayList;

public class Channel implements Subject {

   private ArrayList<Observer> observers = new ArrayList<>();
   private String channelName;
   private String status;


   @Override
   public void registerObserver(Observer ob) {
      observers.add(ob);
   }

   @Override
   public void removeObserver(Observer ob) {
      observers.remove(ob);
   }

   @Override
   public void notifyObserver() {
    for (Observer observer : observers) {
         observer.notify();
    }
   }

   public Channel(String _name, String _status){
      this.channelName = _name;
      this.status = _status;
   }


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

   
   
}
