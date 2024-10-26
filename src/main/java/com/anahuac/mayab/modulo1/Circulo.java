package com.anahuac.mayab.modulo1;
import java.lang.Math;

public class Circulo {
	
	public static double calcularArea(double radio) {
	
		double area = Math.pow(radio, 2) * Math.PI;
		return area;

	}

	public static void main(String[] args) {
		
		double radio = 10;
		
		System.out.println("El área es: " + calcularArea(15));
		System.out.println("El área es: " + calcularArea(5));
		System.out.println("El área es: " + calcularArea(25));	
		System.out.println("El área es: " + calcularArea(radio));	

	}

}
