package com.anahuac.mayab.modulo1;

public class Condicional {

	public static void main(String[] args) {
		
		int edad = 18;
		boolean ine = false;
		
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
			if (ine == true) {
				System.out.println("ya puedes votar");
			}
			else {
				System.out.println("acude a tu módulo");
			}
		}
		else {
			System.out.println("NO Eres mayor de edad");
		}
		//Calcular el mayor de 2 números
		int num1;
		int num2;
		
		num1 = 100;
		num2 = 10000;
		
		if (num1 > num2) {
			System.out.println("El mayor es " +num1 );		
		}
		else {
			if (num1 == num2) {
				System.out.println("Son iguales" + num1 );	
			}
			else {
				System.out.println("El mayor es " +num2 );
			}
		}
		//CALCULAR PROPINA
		double cuenta = 90;
		double propina = 10;
		//cuenta = 90;
		if (cuenta > 100) 
			propina = cuenta * .10;
		System.out.println("La propina es: " + propina);
		
	
	}
	
	
	
}
