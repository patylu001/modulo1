package com.anahuac.mayab.modulo1.sesion3;

public class TestPerro {

	public static void main(String[] args) {
		
		Perro perro1 = new Perro();
		
		Perro perro2 = new Perro("desconocida", "pequeño", 10.5, "firulais", "pepe", 2);
		
		System.out.println("El perro1 se llama: " + perro1.getNombre());
		
		System.out.println("El perro2 se llama: " + perro2.getNombre());
		
		
		//Ya sabemos el nombre del perro1
		perro1.setNombre("solovino");
		
		System.out.println("El perro1 se llama: " + perro1.getNombre());
		
		System.out.println("El perro1 ladra: ");
		perro2.ladrar();
	}

}
