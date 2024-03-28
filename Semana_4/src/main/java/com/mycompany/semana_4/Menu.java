package com.mycompany.semana_4;
import java.util.Scanner;

public class Menu {
    public void Menu(){
        int op;
        do {
        System.out.println("Calculadora");
        System.out.println("{1} Sumar 2 numeros");
        System.out.println("{2} Restar 2 numeros");
        System.out.println("{3} Multiplicar 2 numeros");
        System.out.println("{4} Dividir 2 numeros");
        System.out.println("{5} Calcular el resto de 2 numeros");
        System.out.println("{6} Salir");
        op = validarOp();
        if (op != 6) {
            opcion(op);
        } else {
            System.out.println("Haz salido exitosamente");
        }
       } while (op != 6);
    }
        
    public void opcion(int op){
           int[] nums = validarNums();
           Funciones func = new Funciones(nums[0], nums[1]);
           switch(op){
               case 1 -> System.out.println("La suma entre "+ nums[0]+ " y "+nums[1]+" es:" + func.suma());
               case 2 -> System.out.println("La resta entre "+ nums[0]+ " y "+nums[1]+" es:" + func.resta());
               case 3 -> System.out.println("La multiplicacion entre "+ nums[0]+ " y "+nums[1]+" es:" + func.multi());
               case 4 -> validarDivi(nums[0],nums[1]);
               case 5 -> validarResto(nums[0],nums[1]);     
           }
           
        }
        
    public int validarOp(){
            Scanner scan = new Scanner(System.in);
            do {
                try {
                    System.out.println("Elija una opcion: ");
                int op = Integer.parseInt(scan.nextLine());
                if (op >= 1 && op <= 6) {
                    return op;
                } else {
                    System.out.println("El numero debe estar entre 1 y 6. Intentelo de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un numero valido.");
            }
        } while (true);
             }
        
    public int[] validarNums(){
      Scanner scan = new Scanner(System.in);
      int[] numeros = new int[2];
       do {
            try {
                System.out.println("Ingrese el primer numero: ");
                int num1 = Integer.parseInt(scan.nextLine());
                System.out.println("Ingrese el segundo numero: ");
                int num2 = Integer.parseInt(scan.nextLine());
                if (num1 >= 0 && num2 >= 0) { 
                    numeros[0] = num1;
                    numeros[1] = num2;
                    return (numeros);
                } else {
                    System.out.println("Ambos numeros deben ser positivos. Intentelo de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un numero valido.");
            }
        } while (true);
    }
    
    public void validarDivi(double num1, double num2){ 
        Funciones func = new Funciones((int) num1, (int) num2);
        if (num2 != 0) {
            
            System.out.println("La division entre " + num1 + " y " + num2 + " es: " + func.divi());
        } else {
            System.out.println("La division por cero no existe.");
        }
        }
    
    public void validarResto(double num1, double num2){ 
        Funciones func = new Funciones((int) num1, (int) num2);
            if (num2 != 0) {
               
            System.out.println("El resto de la division entre " + num1 + " y " + num2 + " es: " + func.resto());
        } else {
            System.out.println("No se puede calcular el resto ya que la division por cero no existe.");
        }
            
            
            
            
                }
            }
