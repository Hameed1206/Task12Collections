package javatasks;
import java.util.ArrayList;
//QUE 2
public class ArrayListTest {
    
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> aList = new ArrayList<>();
        
        // Add elements to the ArrayList
        aList.add("Name");
        aList.add("Age");
        aList.add("email");
        aList.add("Ph No");
        aList.add("Address");

        // Print the values of the ArrayList
        System.out.println("Values: " + aList);
        System.out.println("");

        // Iterate through the ArrayList and print each element
        System.out.println("Printing elements using for-each loop:");
        for (String string : aList) {
            System.out.println(string);
        }

        // Remove all elements from the ArrayList
        aList.removeAll(aList);
        System.out.println("");

        // Print the ArrayList after removing all elements
        System.out.println("After removing all elements: " + aList);
    }
}
