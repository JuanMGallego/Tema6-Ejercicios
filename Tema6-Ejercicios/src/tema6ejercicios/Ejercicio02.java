package tema6ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		int cont = 0;
		
		String password;
		String userTry = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-- Jugador 1 --");
		System.out.print("Introduzca una contraseña para adivinar: ");
		password = sc.next();
		System.out.println();
		
		System.out.println("-- Jugador 2 --");
		
		System.out.print("Contraseña secreta: [");
		for (int i = 0 ; i < password.length() ; i++) {
			
			System.out.print("*");
			
		}
		
		System.out.print("]");
		
		while (cont < password.length()) {
			
			System.out.println();
			System.out.print("Intente adivinar la contraseña secreta: ");
			userTry = sc.next();
			System.out.println();
			
			if (userTry.length() < password.length()) {
				
				System.out.println("ERROR: Ha introducido una contraseña más corta");
				
			} else if (userTry.length() > password.length()) {
				
				System.out.println("ERROR: Ha introducido una contraseña más larga");
				
			} else {
				
				cont = 0;
				
				System.out.print("Contraseña secreta: [");
				
				for (int i = 0 ; i < password.length() ; i++) {
					
					if (userTry.charAt(i) == password.charAt(i)) {
						
						System.out.print(password.charAt(i));
						
						cont++;
						
					} else {
						
						System.out.print("*");
						
					}
					
				}

				System.out.print("]");
				
			}

		}
		
		System.out.println("¡ENHORABUENA! Has adivinado la contraseña");
		
		sc.close();
		
	}

}
