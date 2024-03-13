import java.util.HashMap;
import java.util.Map;

class hashmap {
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 300); 
        map.put("UK", 200); 
        map.put("US", 250); 
        map.put("Australia", 150); 

        for(Map.Entry<String, Integer> m : map.entrySet()) {
            System.out.print(m.getKey() + ":");
            System.out.println(m.getValue());
        }
    }
}
