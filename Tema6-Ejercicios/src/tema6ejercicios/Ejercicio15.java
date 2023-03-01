package tema6ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		//Frase/palabra del jugador1
		String phrase;
		
		//Frase/palabra nueva generada
		String newPhrase = "";
		
		//Frase/palabra introduce el jugador2
		String tryPlayer2;
		
		//Letras adivinadas
		int letGuessed = 0;
		
		//Frase/palabra pasada a array por carater
		char phraseArray[];
		
		//Indice del caracter del array
		int charIndex;
		
		//Escaner
		Scanner sc = new Scanner(System.in);
		
		//Pide frase a jugador1
		System.out.print("Introduzca una frase/palabra, jugador 1: ");
		phrase = sc.nextLine();
		System.out.println();
		
		//Lo pasa a array
		phraseArray = phrase.toCharArray();
				
		//Mientras el array contenga algo
		while (phraseArray.length > 0) {
			
			//Generera el índice aleatorio
			charIndex = (int)(Math.random() * phraseArray.length);
			
			//Añade el caracter a la nueva string
			newPhrase += phraseArray[charIndex];
			
			//Copia la tabla desde el índice una posicion atrás y elimina la final para acortarla
			System.arraycopy(phraseArray, charIndex + 1, phraseArray, charIndex, phraseArray.length - (1 + charIndex));
			phraseArray = Arrays.copyOf(phraseArray, phraseArray.length - 1);
			
		}
		
		//Muestra la pista
		System.out.println("Pista: " + newPhrase);
		System.out.println();
		
		//Pide al jugador 2 la frase/palabra
		System.out.print("Jugador 2 intenta adivinar la frase/palabra: ");
		tryPlayer2 = sc.nextLine();
		System.out.println();
		
		//Mientras que no sea igual a la del jugador1
		while (!tryPlayer2.equals(phrase)) {
			
			//Comprueba en todas las posiciones si son iguales en las dos strings,
			//si es así, suma 1 al contador
			for (int i = 0 ; i < tryPlayer2.length() ; i++) {
				
				if (tryPlayer2.charAt(i) == phrase.charAt(i)) {
					
					letGuessed++;
					
				}
				
			}
			
			//Muestra las letras acertadas
			System.out.println("Has acertado " + letGuessed + " letras");
			
			//Pide de nuevo al jugador 2 la frase/palabra
			System.out.print("Incorrecto, vuelva a introducir otra frase/palabra: ");
			tryPlayer2 = sc.nextLine();
			System.out.println();
			
		}
		
		//Mensaje de victoria
		System.out.println("¡¡ENHORABUENA!! Lo has acertado, la palabra era \"" + phrase + "\".");
		
		//Cierra escaner
		sc.close();

	}

}
