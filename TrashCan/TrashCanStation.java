package TrashCan;

public class TrashCanStation {

    public static void main(String args[]) throws Exception {
        TrashCan test = new TrashCan();

        CurrentVolume currentVolume = new CurrentVolume(test);
        test.setSensor(3, "Location B");
        test.setSensor(5, "Location A");
        System.out.println("udin");
    }
}
