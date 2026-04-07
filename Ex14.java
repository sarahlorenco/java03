package Ex14;

import java.util.Scanner;

public class Ex14 {
	public static void main(String [] args) {
		Scanner receba= new Scanner (System.in);
		double valorUnit,percentual,totalSem,valorImposto,totalFinal;
		int quantidade;
		
		System.out.println("Digite o valor unitário");
		valorUnit=receba.nextDouble();
		System.out.println("Digite a quantidade");
		quantidade=receba.nextInt();
		System.out.println("Digite o percentual do IPI");
		percentual=receba.nextDouble();
		
		totalSem=valorUnit * quantidade;
		valorImposto= totalSem * (percentual/100);
		totalFinal= totalSem + valorImposto;
		
		System.out.println("Valor sem imposto = " + totalSem);
		System.out.println("Valor do imposto = " + valorImposto);
		System.out.println("Valor final = " + totalFinal);
		
		receba.close();
	}
	

}
