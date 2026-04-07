package Ex13;

import java.util.Scanner;

public class Ex13 {
	public static void main(String [] args) {
		Scanner receba= new Scanner (System.in);
		int lado1;
		int lado2;
		int lado3;
		System.out.println("Informe o valor do  lado 1");
		lado1=receba.nextInt();
				System.out.println("Informe o valor do  lado 2");
				lado2=receba.nextInt();
				System.out.println("Informe o valor do  lado 3");
				lado3=receba.nextInt();
				
				if (lado1==lado2 && lado2==lado3) {
					System.out.println("Triângulo equilátero");
				}else if(lado1==lado2 || lado2==lado3 || lado1==lado3) {
					System.out.println("Triângulo isósceles");
				}else {
					System.out.println("Triângulo escaleno");
				}
				receba.close();
					
				}
				

}
