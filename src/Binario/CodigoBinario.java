package Binario;

import java.util.Scanner;

public class CodigoBinario {


	    public static void main(String[] args) {
	        int[] numeros = {3, 7, 12, 5, 9, 21};
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Introduce un número a buscar: ");
	        int buscado = sc.nextInt();

	        int indice = -1;

	        for (int i = 0; i < numeros.length; i++) {
	            if (numeros[i] == buscado) {
	                indice = i;
	                break;
	            }
	        }

	        if (indice != -1) {
	            System.out.println("El número está en el índice: " + indice);
	        } else {
	            System.out.println("El número no se encuentra en el array.");
	        }
	    }
	}
