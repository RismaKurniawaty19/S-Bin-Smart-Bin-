package TrashCan;

import java.util.ArrayList;
public class TrashCan implements Subject
{
   private ArrayList<Observer> observers;
   private int volume;
   private String location;
   
   public TrashCan()
   {
       observers = new ArrayList<Observer>();
   }
   
   public void registerObserver(Observer o) {
        observers.add(o);
   }
   
   public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }
   
   public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(volume, location);
        }
    }
   
   public void sensorChanged() {
        notifyObservers();
   }
   
   public void setSensor(int volume, String location){
      this.volume = volume;
      this.location = location;
      sensorChanged();
   }
   
   public int getLatestVolume(){
       return volume;
   }
   
   public String getLatestLocation(){
       return location;
   }
   

}
