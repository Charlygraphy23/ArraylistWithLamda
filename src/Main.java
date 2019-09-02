import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        ArrayList<Productt> list = new ArrayList<>();


        list.add(new Productt(1, "Rice", 30));
        list.add(new Productt(2, "Dal", 50));
        list.add(new Productt(3, "Haldi", 40));

        System.out.println("Before Sorting");

        list.forEach((names) -> System.out.println(names.getId() + " " + names.getName() + " " + names.getPrice()));

        Collections.sort(list, Comparator.comparing(p -> p.getName())
        );
//
//        Set set = new TreeSet(list);
//        System.out.println("After Shorting " +set);
//        set.add(new ProductDetails());
////        for(int i=0;i<list.size();i++){
////            set.add(list);
//        }

        System.out.println("After Shorting ");
        list.forEach((names) -> System.out.println(names.getId() + " " + names.getName() + " " + names.getPrice()));


    }

//    private static class ProductDetails implements Comparator<Productt> {
//
//        @Override
//        public int compare(Productt a, Productt b) {
//            return a.getName().compareTo(b.getName());
//        }
//    }
}