package com.anahuac.mayab.modulo1.proyecto;

public class TestVeterinaria {

	public static void main(String[] args) {
		Perro perro1 = new Perro("pitbull", "grande", 20, "grogu", "ara", 1);
		Perro perro2 = new Perro("salchicha", "pequeño", 5, "ikki", "ale", 3);
		
		CartillaPerro cartilla1 = new CartillaPerro(perro1, "123");
		CartillaPerro cartilla2 = new CartillaPerro(perro2, "124");
		
		Veterinaria vet = new Veterinaria("Mi veterinaria");
		vet.agregarPaciente(cartilla1);
		vet.agregarPaciente(cartilla2);
		
		try {
		
		Servicio servicio1 = vet.realizarServicio("baño", perro1.getNombre(), "16-nov-2024");
		servicio1.realizar(perro1.getNombre());
		Servicio servicio2 = vet.realizarServicio("vacuna", perro2.getNombre(), "16-nov-2024");
		servicio2.setCartilla(cartilla1);
		servicio2.realizar(perro2.getNombre());
		cartilla1.imprimirCartilla();
		
		

	} catch (Exception e) {
		System.out.println("Ese servicio no lo ofrecemos");
		e.printStackTrace();
	}
		
		//imprimir exp
		vet.imprimirExpedientes();

	}
}

