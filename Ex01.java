package Ex01;

import java.util.Scanner;

public class Ex01 {
	
		public static void main (String [] args) {
			Scanner receba = new Scanner (System.in);
			int numero;
			
			System.out.println("digite um numero");
			numero=receba.nextInt();
			
			if (numero%2==0) {
				System.out.println("o numero é divisivel por 2");
			}else if(numero%5==0) {
				System.out.println("o numero é divisivel por 5");
			}else if(numero%10==0) {
				System.out.println("o numero é divisivel por 10");
				
			}else {
				System.out.println("o numero nao é divisivel por nenhum");
			}
			
			receba.close();
			
		}
	}
		

	



