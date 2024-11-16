package com.anahuac.mayab.modulo1.sesion5;

public class PatoSenuelo extends Pato{

	public PatoSenuelo(String nombre, String color) {
		super(nombre, color);
		// TODO Auto-generated constructor stub
	}

	public void comer() {
		System.out.println("Soy un pato señuelo y no como");
	}
	
	public void volar() {
		System.out.println("Soy un pato señuelo y salgo volando");
	}
	
	public void quack() {
		System.out.println("Soy un pato señuelo y soy mudo");
	}
}
