package com.anahuac.mayab.modulo1;

public class CicloWhile {

	public static void main(String[] args) {
		//Vamos a sumar los primeros n números enteros
		int n = 5;
		int suma = 0;
		int contador = 1;
		while (contador <= n) {
			suma = suma + contador;
			contador = contador + 1;
			//contador++;
		}
		System.out.println("LA suma es: " + suma);
		
	}

}
