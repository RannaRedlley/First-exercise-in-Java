package fundamentos;

import java.util.Scanner;

public class exercicio_13 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		System.out.println("Digite F ou M: ");
		char letra = entrada.nextLine().charAt(0);
	
	if (letra=='M') {
		System.out.println("MASCULINO");
		
	} if (letra=='F') {
		System.out.println("FEMININO");
		
	} else 
		System.out.println("Letra invalida, digite F ou M");

		
		
		
	}
	}
