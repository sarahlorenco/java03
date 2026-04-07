package Ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String [] args) {
		Scanner receba= new Scanner (System.in);
		double peso;
		double IMC;
		double altura;
		System.out.println("digite o peso");
		peso=receba.nextDouble();
		System.out.println("digite sua altura em metros");
		altura=receba.nextDouble();
		
		IMC = peso/( altura*altura);
		
		if (IMC<18.5) {
			System.out.println("o indivíduo está abaixo do peso");
		}else if(IMC>=18.5 && IMC<25) {
			System.out.println("o indivíduo está com o peso normal");
		}else if (IMC>=25 && IMC<30) {
			System.out.println("o indivíduo está em sobrepeso");
		}else if (IMC>=30 && IMC<40) {
			System.out.println("o indivíduo está com obesidade");
		}else {
			System.out.println("o indivíduo está com obesidade mórbida");
		}
		
		receba.close();
	}

}
