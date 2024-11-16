package com.anahuac.mayab.modulo1.sesion5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class TestArchivo {

	public static void main(String[] args) {
		
		String nombreArchivo = "prueba.txt";
		FileWriter archivo;
		try {
			archivo = new FileWriter(nombreArchivo);
			PrintWriter pw = new PrintWriter(archivo);
            pw.print("Hola, bienvenido al diplomado de programación\n");
            pw.print("\ten JAVA");
            pw.print("\nEsta es otra línea");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
            
         
	}

}
