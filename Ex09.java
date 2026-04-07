package Ex09;

import java.util.Scanner;

public class Ex09 {
	public static void main(String [] args) {
		Scanner receba= new Scanner (System.in);
		int numero;
		String mensagem;
		
		System.out.println("Digite um numero");
		numero=receba.nextInt();
		
		mensagem = numero>=10 && numero<=50? " Dentro do intervalo": "Fora do intervalo";
		System.out.println(mensagem);
		
		receba.close();
	}

}
