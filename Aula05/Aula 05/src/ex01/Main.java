package ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Usuario user01 = new Usuario();
        Usuario user02 = new Usuario();

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {
            System.out.println("Informe os dados do usuário"+i);

            System.out.println("Informe o nome:");
            if(i == 1){user01.nome = scan.nextLine();}
            if(i == 2){user02.nome = scan.nextLine();}

            System.out.println("Informe o idade:");
            if(i == 1){user01.idade = scan.nextInt();scan.nextLine();}
            if(i == 2){user02.idade = scan.nextInt();scan.nextLine();}

            System.out.println("Informe o CPF:");
            if(i == 1){user01.cpf = scan.nextLine();}
            if(i == 2){user02.cpf = scan.nextLine();}

            System.out.println("Informe o gênero (M ou F):");
            if(i == 1){user01.genero = scan.nextLine();}
            if(i == 2){user02.genero = scan.nextLine();}

            System.out.println("Informe o salário:");
            if(i == 1){user01.salario = scan.nextDouble();scan.nextLine();}
            if(i == 2){user02.salario = scan.nextDouble();scan.nextLine();}

        }

        user01.imprimirInformacoesDeUmUsuario(user01);
        user02.imprimirInformacoesDeUmUsuario(user02);
    }
}
