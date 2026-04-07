package Ex10;

import java.util.Scanner;

public class Ex10 {
	public static void main(String [] args) {
		Scanner receba= new Scanner (System.in);
		double IMC;
		
		System.out.println("Informe seu IMC");
		IMC=receba.nextDouble();
		
		if(IMC<18) {
			System.out.println("Magro");
		}else if (IMC>=18 && IMC<=25) {
			System.out.println("Normal");
		}else {
			System.out.println("Acima do peso");
		}
			
			receba.close();
		
		}
				

}
