package tema6ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		String phrase;
		String codif = "";
		
		final char[] conjunto1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
		final char[] conjunto2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
		
		char c;
		
		char phraseArray[];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine().toLowerCase();
		System.out.println();
		
		phraseArray = phrase.toCharArray();
		
		for (int i = 0 ; i < phrase.length() ; i++) {
			
			c = phraseArray[i];
			
			codif += codifica(conjunto1, conjunto2, c);
			
		}
		
		System.out.println("La frase «" + phrase +  "» se codifica como «" + codif + "».");
		
		sc.close();

	}
	
	static char codifica(char conjunto1[],char conjunto2[], char c) {
		
		for (int i = 0 ; i < conjunto1.length ; i++) {
			
			if (c == conjunto1[i]) {
				
				c = conjunto2[i];
				
				break;
				
			}
			
		}
		
		return c;
		
	}


}
