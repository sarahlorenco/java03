package Ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String [] args) {
		Scanner receba= new Scanner (System.in);
		int saldo;
		double credito;
		
		System.out.println("Informe seu saldo médio");
		saldo=receba.nextInt();
		
		if(saldo<=500){
			credito=0;
		}else if (saldo>=501 && saldo<=1000) {
			credito=saldo * 0.30;
		}else if (saldo>=1001 && saldo<=3000) {
			credito=saldo * 0.40;
		} else {
			credito= saldo * 0.50;
		}
		System.out.println("Seu saldo médio é " + saldo +  "\nSeu crédito é " + credito);
		receba.close();
		}
			
		}
		
		


