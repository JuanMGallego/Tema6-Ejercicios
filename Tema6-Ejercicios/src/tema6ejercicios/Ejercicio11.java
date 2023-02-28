package tema6ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		String phrase;
		String sepPhrase[];
		
		String largePhrase = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca una frase: ");
		phrase = sc.nextLine();
		System.out.println();
		
		sepPhrase = phrase.split(" ");
		
		for (int i = 0 ; i < sepPhrase.length ; i++) {
			
			if (sepPhrase[i].length() > largePhrase.length()) {
				
				largePhrase = sepPhrase[i];
				
			}
			
		}
		
		System.out.println("La palabra más larga de la frase es: " + largePhrase);
		System.out.println("Tiene " + largePhrase.length() + " caracteres.");

		sc.close();
		
	}

}
