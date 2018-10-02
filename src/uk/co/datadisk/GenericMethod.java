package uk.co.datadisk;

public class GenericMethod<T> {

    public <T> T showItem(T t) {
        //System.out.println("The item is: " + t.toString());
        System.out.println(t.getClass());
        return t;
    }

    public <T> void showArray(T[] array) {

        for(T item : array){
            System.out.print(item.toString() + ", ");
        }
        System.out.println();
    }
}
