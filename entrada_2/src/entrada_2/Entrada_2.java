/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entrada_2;

import java.util.Scanner;

/**
 *
 * @author 50494
 */
public class Entrada_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        double salario;
        
        System.out.println("Favor ingresar un nombre: ");
        nombre = entrada.nextLine();
        
        System.out.println("Favor ingresar su edad: ");
        edad = entrada.nextInt();
        
        System.out.println("Favor ingresar su salario: ");
        salario = entrada.nextDouble();
        
       
        System.out.println("Su nombre es: " +nombre);       
        System.out.println("Su edad es : " +edad);    
        System.out.println("Su salario es: " +salario);       
    }
    
}
