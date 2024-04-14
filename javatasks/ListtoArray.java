package javatasks;

import java.util.ArrayList;

//QUE 4
public class ListtoArray {
    
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

        // Convert List to array
        String[] array = aList.toArray(new String[0]);
        System.out.println("");
        // Print the size of array
        System.out.println("Length of array is "+array.length);

        //Iterate through the Array and print each element
        for (String string : array) {
            System.out.println(string);
        }

    }
}
