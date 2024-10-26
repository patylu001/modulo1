package com.anahuac.mayab.modulo1;

import java.time.LocalDate;

public class Circulo {

	
	public static double calcularArea(double radio) {
		
		double area = Math.pow(radio, 2) * Math.PI;
		
		return area;
	}
	
	
	public static double calcularCircunferencia(double radio) {
		
		double circunferencia = 2*Math.PI * radio;
		
		return circunferencia;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Este es el argumento de entrada: " + args[0]);
		double radio = Double.parseDouble(args[0]);
		
		double circunferencia = calcularCircunferencia(5);
		
		System.out.println("El area es: " + calcularArea(15) + " la circunferencia es : " + calcularCircunferencia(15));
		System.out.println("El area es: " + calcularArea(5) + " la circunferencia es : " + circunferencia);
		System.out.println("El area es: " + calcularArea(25));
		System.out.println("El area es: " + calcularArea(45));
		System.out.println("El area es: " + calcularArea(radio));
		//System.out.println("El perimetro es: " + circunferencia);
		
		LocalDate.now();

	}

}
