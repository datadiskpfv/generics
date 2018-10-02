package uk.co.datadisk;

public class Main_Generics_1 {

    public static void main(String[] args) {
//        Store stringStore = new Store();
//
//        // This bad as the object passed can be anything, this type of bug should be picked up at compile time
//        stringStore.setStoreItem(25);
//        System.out.println(stringStore);
//        stringStore.getInfo();
//
//        stringStore.setStoreItem(25.75);
//        System.out.println(stringStore);
//        stringStore.getInfo();
//
////        stringStore.setStoreItem("Hello");
////        System.out.println(stringStore);
////        stringStore.getInfo();

        Hashtable<String, Integer> hashTable = new Hashtable<>("Hello World", 55);
        System.out.println(hashTable);
    }
}

class Store<T extends Number> {
    private T item;

    void setStoreItem(T item) {
        this.item = item;
    }

    private T getItem() {
        return this.item;
    }

    void getInfo() {
        System.out.println("Class: " + this.item.getClass());
    }

    @Override
    public String toString() {
        return "" + getItem().toString();
    }
}

class Hashtable<K, V> {

    private K key;
    private V value;

    public Hashtable(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key.toString() + "-" + value.toString();
    }
}