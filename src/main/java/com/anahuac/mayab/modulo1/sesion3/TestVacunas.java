package com.anahuac.mayab.modulo1.sesion3;

public class TestVacunas {

	public static void main(String[] args) {
		
		Perro perro1 = new Perro("shar pei","firulais","pepe");
		CartillaPerro cartilla = new CartillaPerro();
		
		cartilla.setDatosPerro(perro1);
		
		cartilla.actualizar("rabia", "2-enero-2023");
		cartilla.actualizar("rabia", "2-noviembre-2024");
		//Imprimir las vacunas
		cartilla.imprimirCartilla();
		
		
	}

}
