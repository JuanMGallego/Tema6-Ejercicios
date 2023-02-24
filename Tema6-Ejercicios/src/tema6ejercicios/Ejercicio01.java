package tema6ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		String phrase1;
		String phrase2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce una frase: ");
		phrase1 = sc.nextLine();
		
		System.out.print("Introduce otra frase: ");
		phrase2 = sc.nextLine();
		System.out.println();
		
		if (phrase1.length() < phrase2.length()) {
			
			System.out.println("La primera frase es más corta");
			
		} else if (phrase1.length() == phrase2.length()) {
			
			System.out.println("Las dos frases son igual de largas");
			
		} else {
			
			System.out.println("La segunda frase es más corta");
			
		}
		
		sc.close();

	}

}
