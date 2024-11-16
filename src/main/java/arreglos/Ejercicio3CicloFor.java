package arreglos;

public class Ejercicio3CicloFor {

	public static void main(String[] args)   
    {  
        int[] numbers={60, 10,20,30,40,50}; // Arreglo de enteros
          
        System.out.println("Element at index 0:"+numbers[0]);  
        System.out.println("Element at index 2:"+numbers[2]);  
        System.out.println("Element at index 4:"+numbers[4]);  
        
        int sum=0;  
        for (int i=0;i<numbers.length;i++)   
        {  
            sum+=numbers[i];  // sum = sum + numbers[i]
        }  
        System.out.println("La suma de los números es:"+sum);  
        numbers[3] = 150;
        System.out.println("La posicion 3 es:"+numbers[3]);  
        //Imprimir solamente los números pares
    }
      
	
}
