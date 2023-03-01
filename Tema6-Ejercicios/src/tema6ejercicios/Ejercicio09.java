package tema6ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		//Frase introducida por el usuario
		String phrase;
		
		//Cadena para añadir las letras y generar la frase codificada
		String codif = "";
		
		//Constantes de cada conjunto
		final char[] conjunto1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
		final char[] conjunto2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
		
		//Caracter para almacenar el caracter utilizado en cada momento
		char c;
		
		//Array para separar la frase por caracteres
		char phraseArray[];
		
		//Escaner
		Scanner sc = new Scanner(System.in);
		
		//Pide una frase al usuario
		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine().toLowerCase();
		System.out.println();
		
		//La convierte en un array
		phraseArray = phrase.toCharArray();
		
		//Recorre todo el array
		for (int i = 0 ; i < phrase.length() ; i++) {
			
			//Almacena el caracter de la posicion del array
			c = phraseArray[i];
			
			//Añade el caracter devuelto por la función
			codif += codifica(conjunto1, conjunto2, c);
			
		}
		
		//Resultado final
		System.out.println("La frase Â«" + phrase +  "Â» se codifica como Â«" + codif + "Â».");
		
		//Escaner cerrado
		sc.close();

	}
	
	/**
	 * Función para comprobar y modificar las letras que se tengan que codificar
	 * 
	 * @param conjunto1 Constante del primer conjuunto con las letras a codificar
	 * @param conjunto2 Constante del segundo conjunto con las letras nuevas
	 * @param c Caracter a comprobar y codificar
	 * @return c Caracter ya codificado
	 */
	static char codifica(char conjunto1[],char conjunto2[], char c) {
		
		//Recorre el primer conjunto
		for (int i = 0 ; i < conjunto1.length ; i++) {
			
			//Si coincide con alguna, la cambia
			if (c == conjunto1[i]) {
				
				c = conjunto2[i];
				
				break;
				
			}
			
		}
		
		return c;
		
	}


}
