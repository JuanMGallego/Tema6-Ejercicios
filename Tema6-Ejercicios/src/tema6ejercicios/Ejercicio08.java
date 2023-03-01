package tema6ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		//Frase introducida por el usuario
		String phrase;
		
		//Constantes con el sufijo y prefijo correspondientes con cada dialecto
		final String prefix = "Javalín, javalón";
		final String sufix = "Javalén, len, len";
		
		//Escaner
		Scanner sc = new Scanner(System.in);
		
		//Pide la frase al usuario
		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();
		System.out.println();
		
		//Si empieza con el prefijo y el espacio o tabulador
		if (phrase.startsWith(prefix + " ") || phrase.startsWith(prefix + "\t")) {
			
			//Sobreescribe con una cadena sin el prefijo
            phrase = phrase.substring(prefix.length() + 1);
            
            //Quita los espacios y tabulaciones del principio y final restantes
            phrase = phrase.trim();
            
            //Resultado
            System.out.println("El mensaje traducido del javalandés es: " + phrase);
            
        //Si no, comprueba que sea con el sufijo y que empiece con espacio o tabulación
        } else if (phrase.endsWith(" " + sufix) || phrase.endsWith("\t" + sufix)) {
        	
        	//Sobreescribe la frase sin el sufijo
            phrase = phrase.substring(0, phrase.length() - sufix.length());
            
            //Quita los espacios y tabulaciones iniciales y finales
            phrase = phrase.trim();
            
            //Resultado
            System.out.println("El mensaje de un dialecto del javalandés es: " + phrase);
            
        //Si no, muestra que no es ninguno de los casos
        } else {
        	
            System.out.println("La frase introducida no está escrita en el idioma de Javalandia.");
            
        }
		
		//Cierra escaner
		sc.close();
		
	}

}
