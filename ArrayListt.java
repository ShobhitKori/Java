import java.util.ArrayList;
import java.util.Collections;
public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        
        System.out.println(list.size());

        list.remove(3);
        System.out.println(list);

        list.add(2, 25);
        System.out.println(list);

        System.out.println(list.get(1));

        list.set(0, 10);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
