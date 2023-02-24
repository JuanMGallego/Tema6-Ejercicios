package tema6ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		String word;
		
		String phrase = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-- PROGRAMA PARA UNIR PALABRAS --");
		System.out.println();
		System.out.print("Introduzca palabras hasta poner 'fin': ");
		word = sc.next();
		System.out.println();
		
		while (!word.equalsIgnoreCase("fin")) {
			
			phrase += word + " ";
			
			System.out.print("Introduzca otra palabra: ");
			word = sc.next();
			System.out.println();
			
		}
		
		System.out.println("Palabras separadas por espacio: " + phrase);
		
		sc.close();

	}

}
