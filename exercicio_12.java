package fundamentos;

import java.util.Scanner;

public class exercicio_12 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		System.out.println("Digite a primeira nota:");
		float nota1 = entrada.nextFloat();
		
		Scanner entrada2= new Scanner (System.in);
		System.out.println("Digite a segunda nota:");
		float nota2 = entrada2.nextFloat();
		
		float calculo= (nota1+nota2)/2;
		System.out.println(calculo);
		
}
}

