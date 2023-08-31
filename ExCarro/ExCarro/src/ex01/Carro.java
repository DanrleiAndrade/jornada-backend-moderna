package ex01;

import java.util.Scanner;

public class Carro {

	Scanner scan = new Scanner(System.in);

	int marcha;
	String cor;
	int velocidadeAtual;
	int marchaAtual;
	String ligadoDesligado;
	int velocidadeMaxima;

	public void ligarCarro() {
		this.ligadoDesligado = "ligado";
		System.out.println("O carro está ligado.");
		return;
	}

	public void desligarCarro() {
		this.ligadoDesligado = "desligado";
		System.out.println("O carro está desligado.");
		return;
	}

	public void trocarMarcha() {
		if (this.ligadoDesligado.equals("desligado")) {
			System.out.println("O carro está desligado. Ligue-o.");
		} else if (this.ligadoDesligado.equals("ligado")) {
			System.out.println(" ");
			System.out.println("Escolha a marcha (1 a 5 - ou zero para Neutro)");
			this.marchaAtual = scan.nextInt();
			scan.nextLine();
		}

		if (this.marchaAtual < 0 || this.marchaAtual > 6) {
			System.out.println("Marcha inválida");
		} else if (this.marchaAtual == 0) {
			this.velocidadeMaxima = 0;
			System.out.println("Neutro - 0km/h");
		} else if (this.marchaAtual == 1) {
			this.marchaLog();
		} else if (this.marchaAtual == 2) {
			this.marchaLog();
		} else if (this.marchaAtual == 3) {
			this.marchaLog();
		} else if (this.marchaAtual == 4) {
			this.marchaLog();
		} else if (this.marchaAtual == 5) {
			this.marchaLog();
		}

	}

	public void acelerar() {
		System.out.println("Digite uma velocidade de (1 a 100), para acelerar. Ou (0) para trocar marcha: ");
		int velocidade = scan.nextInt();
		scan.nextLine();

		this.velocidadeAtual += velocidade;
		System.out.println("Velocidade atual " + velocidadeAtual + "km/h");

		if (velocidadeAtual == 0) {
			return;
		}

		if (velocidadeAtual > 0 && velocidadeAtual <= 20) {
			this.marchaAtual = 1;
			marchaLog();

		} else if (velocidadeAtual > 20 && velocidadeAtual <= 40) {
			this.marchaAtual = 2;
			marchaLog();

		} else if (velocidadeAtual > 40 && velocidadeAtual <= 60) {
			this.marchaAtual = 3;
			marchaLog();

		} else if (velocidadeAtual > 60 && velocidadeAtual <= 80) {
			this.marchaAtual = 4;
			marchaLog();

		} else if (velocidadeAtual > 80 && velocidadeAtual <= 100) {
			this.marchaAtual = 5;
			marchaLog();

		}

	}

	public void frear() {
		System.out.println("Digite uma velocidade de (1 a 100), para frear. Ou (0) para trocar marcha: ");
		int velocidade = scan.nextInt();
		scan.nextLine();

		this.velocidadeAtual -= velocidade;
		System.out.println("Velocidade atual " + velocidadeAtual + "km/h");

		if (velocidadeAtual == 0) {
			return;
		}

		if (velocidadeAtual > 0 && velocidadeAtual <= 20) {
			this.marchaAtual = 1;
			marchaLog();

		} else if (velocidadeAtual > 20 && velocidadeAtual <= 40) {
			this.marchaAtual = 2;
			marchaLog();

		} else if (velocidadeAtual > 40 && velocidadeAtual <= 60) {
			this.marchaAtual = 3;
			marchaLog();

		} else if (velocidadeAtual > 60 && velocidadeAtual <= 80) {
			this.marchaAtual = 4;
			marchaLog();

		} else if (velocidadeAtual > 80 && velocidadeAtual <= 100) {
			this.marchaAtual = 5;
			marchaLog();

		}

	}

	private void marchaLog() {
		this.velocidadeMaxima = this.marchaAtual * 20;
		if (velocidadeAtual > velocidadeMaxima) {
			velocidadeAtual = velocidadeMaxima;
		}
		System.out.println(this.marchaAtual + " marcha - " + this.velocidadeMaxima + "km/h - Velocidade Máxima");
		System.out.println("Velocidade atual: " + velocidadeAtual + "km/h");
	}

}

