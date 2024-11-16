package mapas;

import java.util.*;

//Main class
public class Ejercicio6LinkedMap {

 // Main driver method
 public static void main(String[] args)
 {

     // Creating an empty LinkedHashMap
	 LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

     // Inserting pair entries in above Map
     // using put() method
     map.put("uvas", 10);
     map.put("manzanas", 30);
     map.put("platanos", 20);

     // Iterating over Map
     for (Map.Entry<String, Integer> e : map.entrySet())

         // Printing key-value pairs
         System.out.println(e.getKey() + " "
                            + e.getValue());
 }
}
