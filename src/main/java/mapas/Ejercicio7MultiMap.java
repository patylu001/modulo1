package mapas;

import java.util.Collection;

import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Ejercicio7MultiMap {
	
	 public static void main(String[] args)
	 {

		 MultiValuedMap<Integer, String> map = new ArrayListValuedHashMap<>();
		 map.put(1, "A");
		 map.put(1, "B");
		 map.put(1, "C");
		 Collection<String> coll = map.get(1);
		 
		 for(String s : coll) {
			 System.out.println("v = " + s);
		 }
	 
	 }
}
