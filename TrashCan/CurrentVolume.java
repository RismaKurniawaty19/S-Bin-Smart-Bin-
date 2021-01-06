package TrashCan;

public class CurrentVolume implements Display, Observer
{
    private int currentVolume  = 10;
    private int usedVolume;
    private String location;
    private TrashCan trashCan;
    
    public CurrentVolume(TrashCan trashCan)
    {
        this.trashCan = trashCan;
        trashCan.registerObserver(this);
    }
    
    public void update(int newVolume, String newLocation)
    {
        this.location = newLocation;
        this.usedVolume = currentVolume - newVolume;
        //currentVolume = 
        display();
    }
    
    public void display(){
        if(currentVolume >= usedVolume)
        {
            System.out.println("Tong sampah masih bisa diisi!");
            System.out.println("Volume tong sampah di lokasi " + this.location + " bersisa " + this.usedVolume + " liter");
        }
        else
        {
            System.out.println("Tong sampah penuh!");
            System.out.println("Tolong segera diambil!!!!");
        }
    }
}
