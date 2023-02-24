package tema6ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		String phrase;
		String word;
		String sepWords[];
		int timesWord = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca una frase: ");
		phrase = sc.nextLine();
		System.out.print("Introduzca una palabra a buscar: ");
		word = sc.next();
		System.out.println();

		sepWords = phrase.split(" ");
		
		for (int i = 0 ; i < sepWords.length ; i++) {
			
			if (sepWords[i].equals(word)) {
				
				timesWord++;
				
			}
			
		}
		
		System.out.println("La palabra '" + word + "' se repite " + timesWord + " veces");
		
		sc.close();
		
	}

}
