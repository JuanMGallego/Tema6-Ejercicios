package tema6ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		String phrase;
		String inverted = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca una frase: ");
		phrase = sc.nextLine();
		System.out.println();
		
		System.out.println("La frase invertida es: " + invertPhrase(phrase, inverted));
		
		sc.close();
		
	}
	
	static String invertPhrase(String phrase, String inverted) {
		
		for (int i = 0 ; i < phrase.length() ; i++) {
			
			inverted += phrase.charAt(phrase.length()-1 -i);
			
		}
		
		return inverted;
		
	}

}
