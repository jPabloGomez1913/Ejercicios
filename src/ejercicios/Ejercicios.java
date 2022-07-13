package ejercicios;

import java.util.Scanner;

public class Ejercicios {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        mayor();
    }

    static public void mayor() {
        /*Programa que pida 2 numeros y que nos diga cual es el mayor,
        el menor y si son iguales */
        int num1, num2, mayor, menor;
        System.out.println("Ingrese un numero");
        num1 = entrada.nextInt();
        System.out.println("Ingrese un numero");
        num2 = entrada.nextInt();
        if (num1 > num2) {
            mayor = num1;
            menor = num2;
            System.out.println("El mayor es " + mayor);
            System.out.println("El menor es " + menor);
        }
        else if(num2>num1){
                mayor=num2;
                menor=num1;
                System.out.println("El mayor es "+mayor);
                System.out.println("El menor es "+menor);
        }
        else{
            System.out.println("los numeros son iguales ");
            
        }
    }
            

        
    }
