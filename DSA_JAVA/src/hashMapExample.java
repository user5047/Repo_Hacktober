import java.util.HashMap;
 
// Main class
public class GFG {
 
    // Main driver method
    public static void main(String[] args)
    {
        // Create an empty hash map by declaring object
        // of string and integer type
        HashMap<String, Integer> map = new HashMap<>();
 
        // Adding elements to the Map
        // using standard add() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
 
        // Print size and content of the Map
        System.out.println("Size of map is:- "
                           + map.size());
 
        // Printing elements in object of Map
        System.out.println(map);
 
        // Checking if a key is present and if
        // present, print value by passing
        // random element
        if (map.containsKey("vishal")) {
 
            // Mapping
            Integer a = map.get("vishal");
 
            // Printing value fr the corresponding key
            System.out.println("value for key"
                               + " \"vishal\" is:- " + a);
        }
     
      // No need to mention the
        // Generic type twice
        Map<Integer, String> hm1 = new HashMap<>();
 
        // Add Elements using put method
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");
 
        // Initialization of a HashMap
        // using Generics
        HashMap<Integer, String> hm2
            = new HashMap<Integer, String>(hm1);
 
        System.out.println("Mappings of HashMap hm1 are : "
                           + hm1);
       
        System.out.println("Mapping of HashMap hm2 are : "
                           + hm2);
 
    }
}
