import java.util.SortedMap;
import java.util.TreeMap;

public class MySortedMap {
    public static void main(String[] args) {
        SortedMap<String, Integer> mySortedMap = new TreeMap<String, Integer>();

        // Adding key-value pairs to the sorted map
        mySortedMap.put("apple", 1);
        mySortedMap.put("banana", 2);
        mySortedMap.put("orange", 3);

        // Printing the sorted map
        System.out.println("Sorted Map: " + mySortedMap);

        // Accessing a key-value pair using the first and last keys in the sorted map
        String firstKey = mySortedMap.firstKey();
        String lastKey = mySortedMap.lastKey();
        int firstValue = mySortedMap.get(firstKey);
        int lastValue = mySortedMap.get(lastKey);
        System.out.println("Value for key '" + firstKey + "': " + firstValue);
        System.out.println("Value for key '" + lastKey + "': " + lastValue);
    }
}
/*This code creates a TreeMap object and adds some key-value pairs to it using the put method.
It then prints the sorted map using System.out.println, accesses a key-value pair using the first and last keys in the sorted
 map using the firstKey, lastKey, and get methods, and prints those key-value pairs.
 Since TreeMap implements the SortedMap interface, the key-value pairs are automatically sorted by key in natural order.
  The firstKey method is used to access the first (lowest) key in the sorted map, the lastKey method is used to access the last (highest)
  key in the sorted map, and the get method is used to access the value associated with a key.
 */

