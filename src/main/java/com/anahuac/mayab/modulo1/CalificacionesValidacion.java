package com.anahuac.mayab.modulo1;

import java.util.Scanner;

public class CalificacionesValidacion {

	public static void main(String[] args) {
		//Vamos a pedir al usuario las calificaciones para calcular un promedio
		double sumaCalificaciones = 0;
		double calificacion = 0;
		double promedio = 0;
		int contador = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribir una calificación (-1 para salir): ");
		calificacion = sc.nextDouble();		
		while (calificacion != -1) {
			if (calificacion >= 5 && calificacion <= 10) {
				sumaCalificaciones  = sumaCalificaciones + calificacion;
				contador++;
			}
			else {
				System.out.println("La calificación no es válida! (5-10)");
			}
			System.out.println("Escribir una calificación (-1 para salir)");
			calificacion = sc.nextDouble();	
		}
		promedio = sumaCalificaciones / contador;
		System.out.println("El promedio es: "+ promedio);
	}
	
}
