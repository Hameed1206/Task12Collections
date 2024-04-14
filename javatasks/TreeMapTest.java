package javatasks;
//QUE 3
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapTest {
    
    public static void main(String[] args) {
        // Create a TreeMap with string keys and integer values
        TreeMap<String, Integer> tMap = new TreeMap<>();
        
        // Add elements to the TreeMap
        tMap.put("Ajith", 565953);
        tMap.put("Aakash", 565952);
        tMap.put("Kiran", 565951);
        tMap.put("David", 595950);
        tMap.put("Zakir", 565656);

        // Print the TreeMap 
        // By default TreeMap will print in Ascending order based on key
        System.out.println(tMap);
        System.out.println("");

        // Iterate through the TreeMap entries using a for-each loop
        System.out.println("Printing TreeMap entries using for-each loop:");
        for (Entry<String, Integer> entry : tMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
