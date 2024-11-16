package com.anahuac.mayab.modulo1.sesion5;

import java.util.ArrayList;

public class SimuladorPatos {
	
	public void simulaAcciones(ArrayList<Pato> listaPatos) {
		for(Pato p: listaPatos) {
			System.out.println("Nombre:" + p.getNombre());
			p.volar();
			p.quack();
			System.out.println("-------------");
		}
		
	}

}
