package tema6ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		String phrase;
		String inverted = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca una frase: ");
		phrase = sc.nextLine();
		System.out.println();
		
		phrase = phrase.replace(" ", "");
		
		for (int i = 0 ; i < phrase.length() ; i++) {
			
			inverted += phrase.charAt(phrase.length()-1 -i);
			
		}
		
		if (phrase.equalsIgnoreCase(inverted)) {
			
			System.out.println("La frase es palíndroma");
			
		} else {
			
			System.out.println("La frase no es palíndroma");
			
		}
		
		sc.close();

	}

}
