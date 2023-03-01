package tema6ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		String phrase;
		final String prefix = "Javal�n, javal�n";
		final String sufix = "Javal�n, len, len";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();
		System.out.println();
		
		if (phrase.startsWith(prefix + " ") || phrase.startsWith(prefix + "\t")) {
			
            phrase = phrase.substring(prefix.length() + 1);
            
            phrase = phrase.trim();
            
            System.out.println("El mensaje traducido del javaland�s es: " + phrase);
            
        } else if (phrase.endsWith(" " + sufix) || phrase.endsWith("\t" + sufix)) {
        	
            phrase = phrase.substring(0, phrase.length() - sufix.length());
            
            phrase = phrase.trim();
            
            System.out.println("El mensaje de un dialecto del javaland�s es: " + phrase);
            
        } else {
        	
            System.out.println("La frase introducida no est� escrita en el idioma de Javalandia.");
            
        }
		
		sc.close();
		
	}

}
