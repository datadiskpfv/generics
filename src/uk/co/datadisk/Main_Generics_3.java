package uk.co.datadisk;

public class Main_Generics_3 {

    public static void main(String[] args) {

        System.out.println( calculateMin('v', 'h'));
        System.out.println( calculateMin("Paul", "Lorraine"));
        System.out.println( calculateMin(100, 60));
        System.out.println( calculateMin(60, 100));

        Employee paul = new Employee("Paul", "Valle");
        Employee lorraine = new Employee("Lorraine", "Valle");
        System.out.println( calculateMin(paul, lorraine));

    }

    public static <T extends Comparable<T>> T calculateMin(T t1, T t2){

        if(t1.compareTo(t2) < 0){
            return t1;
        }

        return t2;
    }
}
