package mapas;
import java.util.HashMap;
import java.util.Map;

public class Ejericio4HashMap {
    public static void main(String[] args) {
        // Creating a HashMap object
        HashMap<String, Integer> students = new HashMap<>();
 
      
        // Adding key-value pairs (student name and age) to the HashMap
        students.put("Alice", 20);
        students.put("Bob", 22);
        students.put("Charlie", 19);
        students.put("Charlie1", 19);
        students.put("Charlie2", 19);
        students.put("Charlie3", 19);
        
        

        // Retrieving a value by its key
        Integer aliceAge = students.get("Alice");
        System.out.println("Alice's age: " + aliceAge);

        // Checking if a key is present in the HashMap
        boolean containsKey = students.containsKey("David");
        System.out.println("Is David in the HashMap? " + containsKey);

        System.out.println("Tamaño antes de remover a Bob: " + students.size());
       // Removing a key-value pair by its key
        students.remove("Bob");
        
        System.out.println("Tamaño DESPUES de remover a Bob: " + students.size());

        // Iterating over the HashMap using a for-each loop and entrySet
        System.out.println("Iterating over the HashMap:");
        
        
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            String name = entry.getKey();
            Integer age = entry.getValue();
            System.out.println(name + ": " + age);
        }
        
        System.out.println("----- Iterating over the HashMap:  KEYSET----- ");
        //Iterar usando las llaves
        for (String llave : students.keySet()) {
            System.out.println(llave);
            System.out.println("Edad: " + students.get(llave));
        }
        
        System.out.println("----- Encontrar elementos con edad 19----- ");
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            String name = entry.getKey();
            Integer age = entry.getValue();
            if (age == 19)
            	System.out.println(name + ": " + age);
        }
        
/*
        // Using the size() method to find the number of key-value pairs
        int size = students.size();
        System.out.println("Number of students in the HashMap: " + size);*/
    }
}