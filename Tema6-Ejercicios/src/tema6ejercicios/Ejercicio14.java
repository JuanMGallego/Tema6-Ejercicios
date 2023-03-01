package tema6ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		String phrase;
		String newPhrase = "";
		
		String tryPlayer2;
		
		char phraseArray[];
		
		int charIndex;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca una frase/palabra, jugador 1: ");
		phrase = sc.nextLine();
		System.out.println();
		
		phraseArray = phrase.toCharArray();
				
		while (phraseArray.length > 0) {
			
			charIndex = (int)(Math.random() * phraseArray.length);
			
			newPhrase += phraseArray[charIndex];
			
			System.arraycopy(phraseArray, charIndex + 1, phraseArray, charIndex, phraseArray.length - (1 + charIndex));
			phraseArray = Arrays.copyOf(phraseArray, phraseArray.length - 1);
			
		}
		
		System.out.println("Pista: " + newPhrase);
		System.out.println();
		
		System.out.print("Jugador 2 intenta adivinar la frase/palabra: ");
		tryPlayer2 = sc.nextLine();
		System.out.println();
		
		while (!tryPlayer2.equals(phrase)) {
			
			System.out.print("Incorrecto, vuelva a introducir otra frase/palabra: ");
			tryPlayer2 = sc.nextLine();
			System.out.println();
			
		}
		
		System.out.println("¡¡ENHORABUENA!! Lo has acertado, la palabra era \"" + phrase + "\".");
		
		sc.close();
		
	}

}
