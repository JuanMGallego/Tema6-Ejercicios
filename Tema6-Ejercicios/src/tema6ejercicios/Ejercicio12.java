package tema6ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		String phrase1;
		String phrase2;
		
		int lenCount = 0;
		
		char arrayPhrase1[];
		char arrayPhrase2[];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- DETECTOR DE ANAGRAMAS ---");
		System.out.println();
		System.out.print("Introduzca una palabra: ");
		phrase1 = sc.nextLine().replace(" ", "").toLowerCase();
		
		arrayPhrase1 = phrase1.toCharArray();
		
		System.out.println();
		System.out.print("Introduzca otra palabra: ");
		phrase2 = sc.nextLine().replace(" ", "").toLowerCase();
		
		arrayPhrase2 = phrase2.toCharArray();
		
		System.out.println();
		
		if (phrase1.length() == phrase2.length()) {
			
			for (int i = 0 ; i < phrase1.length() ; i++) {
				
				for (int j = 0 ; j < phrase2.length() ; j++) {
					
					if (arrayPhrase1[i] == arrayPhrase2[j]) {
						
						System.arraycopy(arrayPhrase2, j + 1, arrayPhrase2, j, arrayPhrase2.length - (1 + j));
						
						lenCount++;
						
						break;
					}
					
				}
				
			}
			
		}
		
		if (lenCount == phrase2.length()) {
			
			System.out.println("Las dos son anagramas");
			
		} else {
			
			System.out.println("No son anagramas");
			
		}
		
		sc.close();
		
	}

}
