package tema6ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		//Variables para almacenar la frase del usuario y su modificación sin espacios
		String phrase;
		String cleanPhrase;
		
		//Contador del caracter
		int charCount = 0;
		
		//Escaner
		Scanner sc = new Scanner(System.in);
		
		//Se le pide una frase al usuario y se le quitan las mayúsculas
		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine().toLowerCase();
		System.out.println();
		
		//Se pasa a otra variable sin espacios
		cleanPhrase = phrase.replace(" ", "");
		
		//Se construye el principio del resultado
		System.out.println("Frase: " + phrase);
		System.out.println("Resultado:");
		
		//Mientras haya caracteres en la cadena sin los espacios
		while (cleanPhrase.length() > 0) {
			
			//Se buscaen cada caracter de la cadena
			for (int i = 0 ; i < cleanPhrase.length() ; i++) {
				
				//Si el caracter buscado coincide con el primero
				if (cleanPhrase.charAt(i) == cleanPhrase.charAt(0)) {
					
					//Se cuenta uno más al contador
					charCount++;
					
				}
				
			}
			
			//Se muestra el caracter junto con las veces que se repite
			System.out.println(cleanPhrase.charAt(0) + ": " + charCount + " veces");
			
			//Se elimina este caracter para que no se tenga que comprobar más y no se repitan
			cleanPhrase = cleanPhrase.replace("" + cleanPhrase.charAt(0), "");
			
			//Se resetea el contador
			charCount = 0;
			
		}
		
		//Se cierra el escaner
		sc.close();

	}

}
