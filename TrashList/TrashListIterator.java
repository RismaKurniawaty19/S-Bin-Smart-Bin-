import java.util.ArrayList;

public class TrashListIterator implements Iterator {
    ArrayList<String> items;
    int position = 0;

    public TrashListIterator(ArrayList<String> items) {
        this.items = items;
    }

    public String next() {
        position += 1;
        return items.get(position - 1);
    }

    public boolean hasNext() {
        return position < items.size();
        // if (position >= items.size()) {
        // return false;
        // } else {
        // return true;
        // }
    }
}
