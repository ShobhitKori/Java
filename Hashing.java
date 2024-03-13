import java.util.HashMap;
import java.util.HashSet;

public class Hashing {
    public static void majorityElement(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for(int key : map.keySet()) {
            if(map.get(key) > n/3) {
                System.out.println(key);
            }
        }
    }

    public static int union(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++) {
            set.add(arr2[i]);
        }
        return set.size();
    }

    public static int intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }
        for(int j=0; j<arr2.length; j++) {
            if(set.contains(arr2[j])) {
                count++;
                set.remove(arr2[j]);
            }
        }
        return count;
    }

    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();
        for(String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }
        for(String key : tickets.keySet()) {
            if(!(revMap.containsKey(key))) {
                return key; // start
            }
        }
        return null;
    }

    public static void main(String args[]) {
        // int nums[] = {1, 2, 3, 5, 6, 7};
        // int nums2[] = {1, 2, 9};
        // Print the elements which occurs more than n/3 times int the array
        // majorityElement(nums);

        // size of union of two arrays
        // System.out.println(union(nums, nums2));

        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        String start = getStart(tickets);
        while(tickets.containsKey(start)) {
            System.out.print(start+" -> ");
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}
