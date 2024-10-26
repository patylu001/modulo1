package com.anahuac.mayab.modulo1;
import java.util.Scanner;

public class CicloCalificacion {

	public static void main(String[] args) {
		
		double sumaCalificaciones = 0;
		double calificacion = 0;
		double promedio = 0;
		int contador = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa una calificacion (-1 para salir)");
		
		calificacion = sc.nextDouble();
		
		while (calificacion != -1) {
			sumaCalificaciones = sumaCalificaciones + calificacion;
			contador ++;
			System.out.println("Ingresa una calificacion (-1 para salir)");
		calificacion = sc.nextDouble();
		}
		promedio = sumaCalificaciones / contador;
		System.out.println("El promedio es: " + promedio);
		

	}

}
