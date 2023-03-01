package tema6ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		//Frases del usuario
		String phrase1;
		String phrase2;
		
		//Contador de largo de la string
		int lenCount = 0;
		
		//Frases en array
		char arrayPhrase1[];
		char arrayPhrase2[];
		
		//Escaner
		Scanner sc = new Scanner(System.in);
		
		//Título y pide al usuario la frase, le quita los espacios y lo pone en minúsculas
		System.out.println("--- DETECTOR DE ANAGRAMAS ---");
		System.out.println();
		System.out.print("Introduzca una palabra: ");
		phrase1 = sc.nextLine().replace(" ", "").toLowerCase();
		
		//Convierte la frase a array
		arrayPhrase1 = phrase1.toCharArray();
		
		//Pide la segunda y aplica lo mismo
		System.out.println();
		System.out.print("Introduzca otra palabra: ");
		phrase2 = sc.nextLine().replace(" ", "").toLowerCase();
		
		//La convierte a array
		arrayPhrase2 = phrase2.toCharArray();
		
		System.out.println();
		
		//Si las frases miden lo mismo
		if (phrase1.length() == phrase2.length()) {
			
			//Hace un x * y para ir comprobando cada letra de la primera en todas las de la segunda string
			for (int i = 0 ; i < phrase1.length() ; i++) {
				
				for (int j = 0 ; j < phrase2.length() ; j++) {
					
					//Si coinciden
					if (arrayPhrase1[i] == arrayPhrase2[j]) {
						
						//La elimina
						System.arraycopy(arrayPhrase2, j + 1, arrayPhrase2, j, arrayPhrase2.length - (1 + j));
						
						//Añade 1 al contador de largo
						lenCount++;
						
						break;
					}
					
				}
				
			}
			
		}
		
		//Si se ha repetido las mismas veces que el largo de la cadena, es que son anagramas
		if (lenCount == phrase2.length()) {
			
			System.out.println("Las dos son anagramas");
	
		//Si no, no
		} else {
			
			System.out.println("No son anagramas");
			
		}
		
		//Cierra escaner
		sc.close();
		
	}

}
