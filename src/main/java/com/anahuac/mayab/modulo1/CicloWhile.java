package com.anahuac.mayab.modulo1;

public class CicloWhile {

	public static void main(String[] args) {
		
		int n = 5;
		int suma = 0;
		int contador = 1;
		
		while (contador <= n) {
			suma = suma + contador;
			contador++;
		}
		System.out.println("La suma es: " + suma);
	
	}

}
