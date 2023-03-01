package tema6ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		String phrase;
		final String prefix = "Javalín, javalón";
		final String sufix = "Javalén, len, len";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();
		System.out.println();
		
		if (phrase.startsWith(prefix + " ") || phrase.startsWith(prefix + "\t")) {
			
            phrase = phrase.substring(prefix.length() + 1);
            
            while (phrase.length() > 0) {
            	
            	if (phrase.charAt(0) == ' ' || phrase.charAt(0) == '\t') {
            		
            		phrase = phrase.replace("" + phrase.charAt(0), "");
            		
            	} else {
            		
            		break;
            		
            	}
            	
            }
            
            System.out.println("El mensaje traducido del javalandés es: " + phrase);
            
        } else if (phrase.endsWith(" " + sufix) || phrase.endsWith("\t" + sufix)) {
        	
            phrase = phrase.substring(0, phrase.length() - sufix.length());
            
            while (phrase.length() > 0) {
            	
            	if (phrase.charAt(phrase.length() - 1) == ' ' || phrase.charAt(phrase.length() - 1) == '\t') {
            		
            		phrase = phrase.replace("" + phrase.charAt(phrase.length() - 1), "");
            		
            	} else {
            		
            		break;
            		
            	}
            	
            }
            
            System.out.println("El mensaje de un dialecto del javalandés es: " + phrase);
            
        } else {
        	
            System.out.println("La frase introducida no está escrita en el idioma de Javalandia.");
            
        }
		
		sc.close();
		
	}

}
