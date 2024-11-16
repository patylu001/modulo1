package mapas;

import java.util.Map;
import java.util.TreeMap;

public class Ejercicio5TreeMap {

	public static void main(String[] args)
    {

        // Creating an empty TreeMap
        TreeMap<String, Integer> map = new TreeMap<>();

        // Inserting custom elements in the Map
        // using put() method
        map.put("uvas", 10);
        map.put("manzanas", 30);
        map.put("platanos", 20);
        map.put("almendras", 5);

        // Iterating over Map using for each loop
        for (Map.Entry<String, Integer> e : map.entrySet())

            // Printing key-value pairs
            System.out.println(e.getKey() + " "
                               + e.getValue());
    }
	
}
