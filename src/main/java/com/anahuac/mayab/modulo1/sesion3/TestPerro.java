package com.anahuac.mayab.modulo1.sesion3;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TestPerro {

	public static void main(String[] args) {
		
		Perro perro1 = new Perro("Pug", "Pequeño", 8.5, "Franky", "Laura", 7);
		Perro perro2 = new Perro("Desconocida", "Pequeño", 10.5, "Firulais", "Pepe", 2);
		Perro perro3 = new Perro("Pitbull", "Grande", 20, "Grogu", "Ara", 1);
		Perro perro4 = new Perro("Salchicha", "Pequeño", 4.5, "Ikki", "Ale", 3);
		Perro perro5 = new Perro("Malish", "Mediana", 15, "Maya", "Diana", 6);
		
		/*System.out.println("El perro1 se llama: " + perro1.getNombre());
		System.out.println("El perro 2 se llama: " + perro2.getNombre());
		
		perro1.setNombre("Solovino");
		System.out.println("El nombre del perro1 es: " + perro1.getNombre());*/
		
		/*System.out.println("El perro ladra: ");
		perro2.ladrar();*/
		
		//Arreglo perros
		
		System.out.println("-----Usando Arreglo Simple-----");
		
		Perro[] misPerros = new Perro[5];
		
		String[] nombres = {"Franky", "Firulais", "Grogu", "Ikki", "Maya"};
		
		String[] nombresDuenios = {"Laura", "Pepe", "Ara", "Ale", "Diana"};
		
		
		/*for (int i = 0; i<5; i++) {
			misPerros[i] = new Perro();
			misPerros[i].setNombre(nombres[i]);
			misPerros[i].setNombreDuenio(nombresDuenios[aleatorio]);
			misPerros[i].ladrar();
			
		}
		
		/*for (int i = 0; i<5; i++) {
			misPerros[i].ladrar();
		}*/
		
		Random generador = new Random();
		
		for (int i=0; i<5; i++) {
			int aleatorio = generador.nextInt(5);  //nos da un numero aleatorio entre 0 y 10
			misPerros[i] = new Perro();
			misPerros[i].setNombre(nombres[i]);
			misPerros[i].setNombreDuenio(nombresDuenios[aleatorio]);
			misPerros[i].ladrar();
			
		}
		
		//Vamos a usar un ArrayList
		
		System.out.println("-----Usando ArrayList-----");
		
		ArrayList<Perro> listaPerros = new ArrayList<Perro>();
		
		for(int i=0; i<5; i++) {
			Perro perroTemporal = new Perro();
			perroTemporal.setNombre(nombres[i]);
			
			int aleatorio = generador.nextInt(5);  //nos da un numero aleatorio entre 0 y 10
			perroTemporal.setNombreDuenio(nombresDuenios[aleatorio]);
			
			listaPerros.add(perroTemporal);		
			
		}
		
		for (int i = 0; i<5; i++) {
			listaPerros.get(i).ladrar();
		}
		
		//Busqueda de un perro
		for(int i=0; i<listaPerros.size(); i++) {
			String nombre = listaPerros.get(i).getNombre();
			if (nombre == "Perro5") {
				listaPerros.get(i).setNombre("Nuevo nombre del perro");
				break;
			}
		}
		
		/*System.out.println("-----Despues de cambiar el nombre-----");
		for (int i = 0; i<5; i++) {
			listaPerros.get(i).ladrar();
		}
		
		System.out.println("-----For each-----");
		for(Perro perro : listaPerros) {
			perro.ladrar();
		}*/
		
		System.out.println("-----Usando un hashMap con keyset-----");
		
		HashMap<Integer, Perro> mapPerros = new HashMap<>();
		
		for(int i=0; i<5; i++) {
			Perro perroTemporal = new Perro();
			perroTemporal.setNombre(nombres[i]);
			
			int aleatorio = generador.nextInt(nombres.length);  //nos da un numero aleatorio entre 0 y 10
			perroTemporal.setNombreDuenio(nombresDuenios[aleatorio]);
			
			
			//Ya que estan seteados los valores, ahora guardo en el mapa
			mapPerros.put(i, perroTemporal);
			
		}
		
		for(Integer i : mapPerros.keySet()) {
			mapPerros.get(i).ladrar();
		}
		
		System.out.println("-----Usando un hashMap con entryset-----");
		for(Entry<Integer, Perro> entry : mapPerros.entrySet()) {
			entry.getValue().ladrar();
			
		}
		
		System.out.println("-----Usando un hashMap con values-----");
		for(Perro p : mapPerros.values()) {
			p.ladrar();
		}
	}

}
