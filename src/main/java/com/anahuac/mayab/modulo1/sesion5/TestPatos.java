package com.anahuac.mayab.modulo1.sesion5;

import java.util.ArrayList;

public class TestPatos {

	public static void main(String[] args) {
		Pato pato1 = new PatoMallard("mallard","negro");
		
		//PatoMallard pato1 = new PatoMallard("mallard","negro");
		
		Pato pato2 = new PatoHule("hule","amarillo");
		
		Pato pato3 = new PatoSenuelo("señuelo","gris");
		
		Pato pato4 = new PatoSenuelo("señuelo2","cafe");
		
		Pato pato5 = new PatoPapel("papel","blanco");
		/*
		System.out.println("Nombre:" + pato1.getNombre());
		pato1.quack();
		System.out.println("Nombre:" + pato2.getNombre());
		pato2.quack();
		System.out.println("Nombre:" + pato3.getNombre());
		pato3.quack();*/
		
		ArrayList<Pato> listaPatos = new ArrayList<Pato>();
		listaPatos.add(pato1);
		listaPatos.add(pato2);
		listaPatos.add(pato3);
		listaPatos.add(pato4);
		listaPatos.add(pato5);
		
		
		SimuladorPatos simulador = new SimuladorPatos();
		simulador.simulaAcciones(listaPatos);
		
	}

}
