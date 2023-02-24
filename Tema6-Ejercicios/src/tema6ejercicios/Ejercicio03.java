package tema6ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		String phrase;
		
		int spaces = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca una frase: ");
		phrase = sc.nextLine();
		System.out.println();
		
		for (int i = 0 ; i < phrase.length() ; i++) {
			
			if (phrase.charAt(i) == ' ') {
				
				spaces++;
				
			}
			
		}
		
		System.out.println("La frase tiene " + spaces + " espacios");
		
		sc.close();
		
	}

}
