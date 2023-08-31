package ex01;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner scan2 =new Scanner (System.in);
				
		Carro polo = new Carro();
		polo.cor = "Preto";
		
		System.out.println(
				"O que você deseja fazer: \n" + 
				"1 - Ligar o carro\n" + 
				"2 - Desligar o carro\n" + 
				"3 - Acelerar\n" + 
				"4 - Frear\n" + 
				"5 - Trocar marcha\n");
		int opcaoEscolhida = scan2.nextInt();scan2.nextLine();
		
		while (true) {
			switch (opcaoEscolhida) {
			case 2: {				
				polo.desligarCarro();
				break;
			}case 1: {
				polo.ligarCarro();
				break;
			}case 3: {
				polo.acelerar();
				break;
			}case 4: {
				polo.frear();
				break;
			}case 5: {
				polo.trocarMarcha();
				break;
			}
			
			}
			System.out.println(
					" \n" + 
					"O que mais você deseja fazer: \n" + 
					"1 - Ligar o carro\n" + 
					"2 - Desligar o carro\n" + 
					"3 - Acelerar\n" + 
					"4 - Frear\n" + 
					"5 - Trocar marcha\n");
			opcaoEscolhida = scan2.nextInt();scan2.nextLine();
			
			if (opcaoEscolhida == 2) {
				System.out.println("O carro foi desligado");
				break;
			}
			
		}
		scan2.close();
		

	}

}
