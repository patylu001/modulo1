package com.anahuac.mayab.modulo1.sesion3;

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

	}

}
