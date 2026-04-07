package Ex04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String [] args) {
		Scanner receba= new Scanner (System.in);
		int prato;
		int bebida;
		int sobremesa;
		int calorias=0;
		
		System.out.println("PRATOS");
		System.out.println("1-vegetariano");
		System.out.println("2-peixe");
		System.out.println("3-frango");
		System.out.println("4-carne");
		System.out.println("Indique a numeração do prato escolhido");
		prato=receba.nextInt();
		
		switch (prato) {
		case 1 :
			calorias = calorias + 180;
			break;
		case 2:
			calorias = calorias + 230;
			break;
		case 3 :
			calorias = calorias + 250;
			break;
		case 4 :
			calorias = calorias + 350;
			break;
			default:
				System.out.println("opção inválida");
				break;
		}
		
		System.out.println("BEBIDAS");
		System.out.println("1-chá");
		System.out.println("2-suco de laranja");
		System.out.println("3-suco de melão");
		System.out.println("4-refrigerante diet");
		System.out.println("Indique a numeração da bebida escolhida");
		bebida=receba.nextInt();
		
		switch (bebida) {
		case 1:
			calorias = calorias + 20;
			break;
		case 2:
			calorias = calorias + 70;
			break;
		case 3:
			calorias = calorias + 100;
			break;
		case 4:
			calorias  = calorias + 65;
			break;
			default:
				System.out.println("opção inválida");
				break;
		}
		
		System.out.println("SOBREMESAS");
		System.out.println("1-abacaxi");
		System.out.println("2-sorvete diet");
		System.out.println("3-mouse diet");
		System.out.println("4-mouse chocolate");
		System.out.println("Indique a numeração da sobremesa escolhida");
		sobremesa=receba.nextInt();
		
		switch (sobremesa) {
		case 1:
			calorias = calorias + 75;
			break;
		case 2 :
			calorias  = calorias + 110;
			break;
		case 3:
			calorias = calorias + 170;
			break;
		case 4 :
			calorias  =  calorias + 200;
			break;
			default:
				System.out.println("opção inválida");
				break;
		}
		System.out.println("calorias totais = " + calorias);
		receba.close();
	}
}
		
		
		
	
		
		
			
			
			
		
		
		
	
		

