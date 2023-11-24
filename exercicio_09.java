package fundamentos;

import java.util.Scanner;

public class exercicio_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner (System.in);
		System.out.println("Digite um numero:");
		double resp = entrada.nextDouble();
		
		if (resp==0){
			System.out.println("Numero neutro");
			
		}
		
		else if (resp<0){
				System.out.println("Numero negativo");
			
			
		}
		else {
			System.out.println("Numero positivo");
	}
	}
}
