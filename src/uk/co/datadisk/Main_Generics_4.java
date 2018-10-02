package uk.co.datadisk;

import java.util.ArrayList;
import java.util.List;

public class Main_Generics_4 {

    // Type witness

    public static void main(String[] args) {

        List<Bucket<String>> list1 = new ArrayList<>();
        List<Bucket<Integer>> list2 = new ArrayList<>();

        Main_Generics_4.addStore("Paul", list1);
        //Main_Generics_4.addStore(55, list1);        // would be picked up at compile time
        Main_Generics_4.addStore(55, list2);

        // Below is known as type witness
        Main_Generics_4.<String>addStore("Lorraine", list1);
        Main_Generics_4.<Integer>addStore(56, list2);

    }

    public static <T> void addStore(T t, List<Bucket<T>> list) {
        Bucket<T> bucket = new Bucket<>();
        bucket.setItem(t);
        list.add(bucket);
        System.out.println(t.toString() + " has been added to the bucket....");
    }
}

class Bucket<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}