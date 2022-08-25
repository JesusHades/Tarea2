
import java.util.Scanner;

public class Princi {
    
public static void main(String[]arg){
        
Scanner entrada = new Scanner(System.in);  

Arreglo empleados [] = new Arreglo [2];   
       
 String nombre = " ";
 int edad = 0;   
       
for (int i = 0; i<empleados.length; i++) {
    
    System.out.println("Ingresa un nombre:");
    nombre = entrada.next();
    
    System.out.println("Ingresa una edad:");
    edad = entrada.nextInt();
    System.out.println("\n");
    
    entrada.nextLine();
    
    
    empleados[i] = new Arreglo(nombre, edad);
    
}
 
System.out.println("Arreglo:");


for (int i = 0; i<empleados.length; i++) {
    
System.out.println(empleados[i].toString());

} 


System.out.println("\n");
System.out.println("------Arreglo Vacio----");


for(int i = 0; i<empleados.length-1; i++) {
    
 empleados[i].limpiar();
 System.out.println(empleados[i]);
 
}

}

}