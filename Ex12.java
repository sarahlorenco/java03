package Ex12;

import java.util.Scanner;

public class Ex12 {
	public static void main(String [] args) {
		Scanner receba= new Scanner (System.in);
		int numero;
		
		System.out.println("Digite um número inteiro");
		numero=receba.nextInt();
		
		if (numero%3==0 && numero%5==0) {
			System.out.println("o número é múltiplo de 3 e 5");
		}else if(numero%3==0) {
			System.out.println(" o número é apenas múltiplo de 3");
		} else if( numero%5==0) {
			System.out.println("o número é apenas múltiplo de 5");
		}else {
			System.out.println("nenhum");
		}
		receba.close();
		}
		}


