package tema6ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		//Frase del usuario
		String phrase;
		
		//Array para almacenar la frase separada
		String sepPhrase[];
		
		//Palabra m·s larga
		String largePhrase = "";
		
		//Escaner
		Scanner sc = new Scanner(System.in);
		
		//Pide al usuario la frase
		System.out.print("Introduzca una frase: ");
		phrase = sc.nextLine();
		System.out.println();
		
		//Pasa a array la cadena separada por los espacios
		sepPhrase = phrase.split(" ");
		
		//Recorre el array
		for (int i = 0 ; i < sepPhrase.length ; i++) {
			
			//Si el largo de la cadena de esa posiciÛn es mayor a el largo de la palabra m·s larga anterior
			if (sepPhrase[i].length() > largePhrase.length()) {
				
				//La nueva palabra m·s larga ser· la que tiene el Ìndice
				largePhrase = sepPhrase[i];
				
			}
			
		}
		
		//Resultado final
		System.out.println("La palabra m√°s larga de la frase es: " + largePhrase);
		System.out.println("Tiene " + largePhrase.length() + " caracteres.");

		//Escaner cerrado
		sc.close();
		
	}

}
