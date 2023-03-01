package tema6ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		//Frase introducida por el usuario
		String phrase;
		
		//Cadena para introducir las letras en orden inverso
		String inverted = "";
		
		//escaner
		Scanner sc = new Scanner(System.in);
		
		//Pide la frase al usuario
		System.out.print("Introduzca una frase: ");
		phrase = sc.nextLine();
		System.out.println();
		
		//Cambia los espacios por ningun caracter (los elimina)
		phrase = phrase.replace(" ", "");
		
		//Recorre cada caracter de la frase
		for (int i = 0 ; i < phrase.length() ; i++) {
			
			//Introduce en la cadena el caracter empezando por el final
			inverted += phrase.charAt(phrase.length()-1 -i);
			
		}
		
		//Si coinciden (Sin tener en cuenta las mayúsculas)
		if (phrase.equalsIgnoreCase(inverted)) {
			
			System.out.println("La frase es palíndroma");
			
		//Si no
		} else {
			
			System.out.println("La frase no es palíndroma");
			
		}
		
		//Cierra el escaner
		sc.close();

	}

}
