package tema6ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		String phrase;
		String divPhrase[];
		final String prefix = "Javal�n, javalon";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
		phrase = sc.nextLine();
		System.out.println();
		
		divPhrase = phrase.split("/t");
		
		if (divPhrase.length == 1) {
			
			System.out.println("La frase no est� escrita en el idioma de Javalandia");
			
		} else {
			
			
			
		}
		
	}

}
