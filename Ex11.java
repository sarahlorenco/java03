package Ex11;

import java.util.Scanner;

public class Ex11 {
	public static void main(String [] args) {
		Scanner receba= new Scanner (System.in);
		int option;
		System.out.println("OPÇÕES");
		System.out.println("1-Ver saldo");
		System.out.println("2-Depositar");
		System.out.println("3-Sair");
		option=receba.nextInt();
		
		switch (option) {
		case 1 :
			System.out.println("acessando saldo");
			break;
		case 2 :
			System.out.println( "Acessando Área de deposito");
			break;
		case 3:
			System.out.println("Saindo");
			break;
			default:
				System.out.println("opção inválida");
				break;
		}
		receba.close();
		}

}
