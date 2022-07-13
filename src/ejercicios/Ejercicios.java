package ejercicios;

import java.util.Scanner;

public class Ejercicios {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        //mayor();
        //mayor3Num();
        sumBucle();
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
        } else if (num2 > num1) {
            mayor = num2;
            menor = num1;
            System.out.println("El mayor es " + mayor);
            System.out.println("El menor es " + menor);
        } else {
            System.out.println("los numeros son iguales ");

        }
    }

    static public void mayor3Num() {
        /*Mayor y menor de 3 numeros ingresados*/
        int num1, num2, num3, mayor, menor = 0;
        System.out.println("Ingrese un numero");
        num1 = entrada.nextInt();
        System.out.println("Ingrese un numero");
        num2 = entrada.nextInt();
        System.out.println("Ingrese un numero");
        num3 = entrada.nextInt();
        if (num1 > num2 && num1 > num3) {
            mayor = num1;
            if (num2 > num3) {
                menor = num3;
            } else {
                menor = num2;
            }
        } else if (num2 > num3) {
            mayor = num2;
            if (num3 > num1) {
                menor = num1;
            }
        } else {
            mayor = num3;
            if (num2 > num1) {
                menor = num1;
            } else {
                menor = num2;
            }
        }
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }

    static public void sumBucle() {
        /* pedir numeros hasta que se ingrese uno negativo y 
       mostrar la suma y promedio de los ingreados*/
        int num, suma = 0, prom, cont = 0;
        
        
        
        do {
            System.out.println("Ingrese un numero: ");
            num=entrada.nextInt();
            if (num<0) {
                break;
            }
            suma+=num;
            cont+=1;
        } while (num>0);
        prom=suma/cont;
        System.out.println("La suma es: "+suma);
        System.out.println("El promedio es: "+prom);
    }
}
