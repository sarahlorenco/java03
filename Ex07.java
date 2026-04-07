package Ex07;

import java.util.Scanner;

public class Ex07 {
	public static void main(String [] args) {
		Scanner receba= new Scanner (System.in);
		
		double valor;
		String mensagem;
		
		System.out.println("Informe o valor de sua compra");
		valor=receba.nextDouble();
		
		mensagem = valor>100? "sua compra tem 10% de desconto": " sua compra não tem desconto";
		System.out.println(mensagem);
		
		receba.close();
	}

}
