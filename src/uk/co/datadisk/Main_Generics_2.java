package uk.co.datadisk;

public class Main_Generics_2 {

    public static void main(String[] args) {

        GenericMethod genericMethod = new GenericMethod<>();
//        String result = genericMethod.showItem(25)
//        System.out.println();

        Integer[] ia1 = {1,2,3,4,5};
        String[] sa1 = {"Paul", "Lorraine", "Dominic", "Jessica"};
        genericMethod.showArray(ia1);
        genericMethod.showArray(sa1);


    }
}

