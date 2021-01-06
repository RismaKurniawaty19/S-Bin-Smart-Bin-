import java.util.ArrayList;

public class TrashList implements Trash {
    ArrayList<String> trashList;

    public TrashList() {
        trashList = new ArrayList<String>();
    }

    public void addItem(String trash) {
        trashList.add(trash);
    }

    public Iterator createIterator() {
        return new TrashListIterator(trashList);
    }

    public String toString() {
        return "Trash List";
    }
}
