package com.anahuac.mayab.modulo1.sesion3;

public class TestCartilla {

	public static void main(String[] args) {
		
		Perro miPerro = new Perro("unica", "grande", 20, "firulais", "ara", 5);
		
		CartillaPerro cartilla = new CartillaPerro();
		
		cartilla.setDatosPerro(miPerro);
		
		cartilla.actualizar("rabia", "15-11-2024");
		cartilla.actualizar("parvovirus", "30-11-2024");
		cartilla.actualizar("desparacitacion", "10-12-2024");
		
		cartilla.imprimirCartilla();
		
		//Metodo que imprime el archivo con la cartilla
		cartilla.imprimirExpediente();

	}

}
