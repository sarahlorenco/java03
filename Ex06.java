package Ex06;

import java.util.Scanner;

public class Ex06 {
	public static void main(String [] args) {
		Scanner receba= new Scanner (System.in);
		int numero1;
		int numero2;
		char operacao;
		double resultado=0;
		
		System.out.println("digite um numero inteiro");
		numero1=receba.nextInt();
		System.out.println("digite outro numero inteiro");
		numero2=receba.nextInt();
		System.out.println("digite uma operação");
		operacao=receba.next().charAt(0);
		
		switch (operacao) {
		case ('+'):
			resultado = numero1 + numero2;
		break;
		case ('-'):
			resultado = numero1 - numero2;
		break;
		case ('*'):
			resultado = numero1 * numero2;
		break;
		case ('/'):
			resultado = numero1/numero2;
		break;
		default:
			System.out.println("inválido");
		}
		System.out.println("O resultado é " + resultado);
		receba.close();
			
		}
		}
		
		
		


