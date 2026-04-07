package Ex08;

import java.util.Scanner;

public class Ex08 {
	public static void main(String [] args) {
		Scanner receba= new Scanner (System.in);
		String usuario;
		int senha;
		
		System.out.println("Informe o nome de usuário");
		usuario=receba.nextLine();
		System.out.println("Informe a sequência de numeros (senha)");
		senha=receba.nextInt();
		
		if( usuario.equals("admin") && senha==123) {
			System.out.println("Acesso permitido");
		}else {
			System.out.println("Acesso negado");
		}
		
			receba.close();
			
		
			
		}
		

}
