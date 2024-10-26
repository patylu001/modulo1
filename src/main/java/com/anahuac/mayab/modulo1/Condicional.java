package com.anahuac.mayab.modulo1;

public class Condicional {

	public static void main(String[] args) {
		
		int edad = 18;
		boolean ine = true;
		
		if (edad>=18) {
			System.out.println("Es mayor de edad");
			if (ine == true) {
				System.out.println("Ya puedes votar");
			}else {
				System.out.println("Acude a tu modulo");
			}
		}
		else {
			
			System.out.println("No es mayor de edad");
		}
	

	}

}
