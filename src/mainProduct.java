import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.stream.Stream;

public class mainProduct {
    public static void main(String[] args) {

        ArrayList<Productt> list = new ArrayList<>();
        list.add(new Productt(1, "Rice", 30));
        list.add(new Productt(2, "Dal", 50));
        list.add(new Productt(3, "Haldi", 40));

        System.out.println("Before Filter");

        list.forEach((name)-> System.out.println(name.getId()+" "+name.getName()+" "+name.getPrice()));

        System.out.println("After Filter");

        // doing filter
        Stream<Productt> filter=list.stream().filter(
          p->p.getPrice()>30
        );

        filter.forEach((QName)-> System.out.println(QName.getId()+" "+QName.getName()+" "+QName.getPrice()));




    }
}
