package ex03;

import java.util.Scanner;

public class Ex03 {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        double nota;

        System.out.println("||==========ESCOLA MODERNA==========||");
        System.out.println("Digite sua nota: ");
        nota = scan.nextDouble();scan.nextLine();
        scan.close();

        if (nota >= 7d){
            System.out.println("Parabéns, você passou direto!");
        } else if (nota >= 5d && nota < 7d){
            System.out.println("Você tem direito a fazer uma prova de recuperação.");
        } else {
            System.out.println("Você foi reprovado.");
        }

        System.out.println("Obrigado!");

    }
}
