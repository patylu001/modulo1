package com.anahuac.mayab.modulo1.sesion3;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TestPerro {

	public static void main(String[] args) {
		
		Perro perro1 = new Perro();
		Perro perro2 = new Perro("Desconocida", "Pequeño", 10.5, "Firulais", "Pepe", 2);
		
		System.out.println("El perro1 se llama: " + perro1.getNombre());
		System.out.println("El perro 2 se llama: " + perro2.getNombre());
		
		perro1.setNombre("Solovino");
		System.out.println("El nombre del perro1 es: " + perro1.getNombre());
		
		System.out.println("El perro ladra: ");
		perro2.ladrar();
		
		//Arreglo perros
		
		Perro[] misPerros = new Perro[10];
		
		String[] nombres = {"Perro1", "Perro2", "Perro3", "Perro4", "Perro5", "Perro6", "Perro7", "Perro8", "Perro9", "Perro10"};
		
		String[] nombresDuenios = {"Persona1", "Persona2", "Persona3", "Persona4", "Persona5", "Persona6", "Persona7", "Persona8", "Persona9", "Persona10"};
		
		
		for (int i = 0; i<10; i++) {
			misPerros[i] = new Perro();
			misPerros[i].setNombre(nombres[i]);
			
		}
		
		for (int i = 0; i<10; i++) {
			misPerros[i].ladrar();
		}
		
		Random generador = new Random();
		
		for (int i=0; i<10; i++) {
			int aleatorio = generador.nextInt(10);  //nos da un numero aleatorio entre 0 y 10
			misPerros[i].setNombreDuenio(nombresDuenios[aleatorio]);
			misPerros[i].ladrar();
			
		}
		
		//Vamos a usar un ArrayList
		
		System.out.println("-----Usando ArrayList-----");
		
		ArrayList<Perro> listaPerros = new ArrayList<Perro>();
		
		for(int i=0; i<10; i++) {
			Perro perroTemporal = new Perro();
			perroTemporal.setNombre(nombres[i]);
			
			int aleatorio = generador.nextInt(10);  //nos da un numero aleatorio entre 0 y 10
			perroTemporal.setNombreDuenio(nombresDuenios[aleatorio]);
			
			listaPerros.add(perroTemporal);		
			
		}
		
		for (int i = 0; i<10; i++) {
			listaPerros.get(i).ladrar();
		}
		
		//Busqueda de un perro
		for(int i=0; i<listaPerros.size(); i++) {
			String nombre = listaPerros.get(i).getNombre();
			if (nombre == "Perro6") {
				listaPerros.get(i).setNombre("Nuevo nombre del perro");
				break;
			}
		}
		
		System.out.println("-----Despues de cambiar el nombre-----");
		for (int i = 0; i<10; i++) {
			listaPerros.get(i).ladrar();
		}
		
		System.out.println("-----For each-----");
		for(Perro perro : listaPerros) {
			perro.ladrar();
		}
		
		System.out.println("-----Usando un hashMap con keyset-----");
		HashMap<Integer, Perro> mapPerros = new HashMap<>();
		
		for(int i=0; i<10; i++) {
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
