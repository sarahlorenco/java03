package Ex05;

import java.util.Scanner;

public class Ex05 {
	public static void main(String [] args) {
		Scanner receba= new Scanner (System.in);
		int numero;
		System.out.println("Digite um numero de 1 à 7");
		numero=receba.nextInt();
		
		switch (numero) {
		case 1 :
			System.out.println("Fim de semana");
			break;
		case 2 :
			System.out.println("Dia útil");
			break;
		case 3:
			System.out.println("Dia útil");
			break;
		case 4:
			System.out.println("Dia útil");
			break;
		case 5 :
			System.out.println("Dia útil");
			break;
		case 6:
			System.out.println("Dia útil");
			break;
		case 7:
			System.out.println("Fim de semana");
			break;
			default:
				System.out.println("opção inválida");
				break;
		}
		receba.close();
		
		}
		

}
