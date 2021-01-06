public class Main {
    public static void main(String[] args) {
        TrashList trashList = new TrashList();

        trashList.addItem("| kantung plastik");
        trashList.addItem("| botol kosong");
        trashList.addItem("| botol kosong");
        trashList.addItem("| botol kosong");
        // create iterator
        Iterator trashIterator = trashList.createIterator();
        System.out.println("/--------------------------------------/");
        System.out.println("| " + trashList);
        System.out.println("/--------------------------------------/");
        printTrash(trashIterator);
        System.out.println("/--------------------------------------/");
    }

    public static void printTrash(Iterator iterator) {
        while (iterator.hasNext()) {
            // String trashItem = (String) iterator.next();
            System.out.println(iterator.next());
        }
    }
}
