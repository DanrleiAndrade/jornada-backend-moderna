package ex01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = null;
        String sexo = null;
        int idade = 0;
        int opcaoMenu;
        double[] notasPortugues = new double[3];
        double[] notasMatematica = new double[3];
        double mediaPortugues = 0d;
        double mediaMatematica = 0d;
        String resultadoPortugues = null;
        String resultadoMatematica = null;

        System.out.println("|============= ACADEMIA JEDI =============|\n" +
                           " Bem-vindo ao Sistema de Cadastro de Notas.");
        System.out.println("-------------------------------------------\n" +
                           "      - Digite o número de uma opção -\n");
        System.out.println("(1) - Registrar aluno/padawan;\n" +
                           "(2) - Registrar notas de Português;\n" +
                           "(3) - Registrar notas de Matemática;\n" +
                           "(4) - Mostrar informações do aluno/padawan;\n" +
                           "(5) - Mostrar notas;\n" +
                           "(6) - Encerrar sessão.");
        opcaoMenu = scan.nextInt();scan.nextLine();

        while(true){
            if(opcaoMenu < 1 || opcaoMenu > 6){
                System.out.println("Opção inválida, Jedi.");
            }else if (opcaoMenu == 6){
                break;
            }

            switch (opcaoMenu){
                case(1):
                    System.out.println("Digite o nome do aluno/padawan:");
                    nome = scan.nextLine();
                    System.out.println("Digite o sexo do aluno/padawan (M ou F):");
                    sexo = scan.nextLine();
                    System.out.println("Digite a idade do aluno/padawan:");
                    idade = scan.nextInt();scan.nextLine();
                    break;
                case(2):
                    System.out.println("Digite as três notas de Português (x,x):");
                    for (int i = 0; i < 3; i++){
                        System.out.println("Nota 0" + (i + 1));
                        notasPortugues[i] = scan.nextDouble();scan.nextLine();
                    }
                    break;
                case(3):
                    System.out.println("Digite as três notas de Matemática (x,x):");
                    for (int i = 0; i < 3; i++){
                        System.out.println("Nota 0" + (i + 1));
                        notasMatematica[i] = scan.nextDouble();scan.nextLine();
                    }
                    break;
                case(4):
                    System.out.println("|==== INFORMAÇÕES DO ALUNO/PADAWAN ====|");
                    System.out.printf("Nome: %s | Sexo: %s\n" +
                            "Idade: %s", nome, sexo, idade);
                    break;
                case(5):
                    double somaNotasPortugues = 0d;
                    for (double nota : notasPortugues ) {
                        somaNotasPortugues += nota;
                    }
                    mediaPortugues = somaNotasPortugues / 3;

                    double somaNotasMatematica = 0d;
                    for (double nota : notasMatematica ) {
                        somaNotasMatematica += nota;
                    }
                    mediaMatematica = somaNotasMatematica / 3;

                    if (mediaPortugues >= 7d){
                        resultadoPortugues = " [APROVADO]";
                    }else if (mediaPortugues >= 5d && mediaPortugues < 7d) {
                        resultadoPortugues = " [EM RECUPERAÇÃO]";
                    } else if (mediaPortugues < 5d) {
                        resultadoPortugues = " [REPROVADO]";
                    }

                    if (mediaMatematica >= 7d){
                        resultadoMatematica = " [APROVADO]";
                    }else if (mediaMatematica >= 5d && mediaMatematica < 7d) {
                        resultadoMatematica = " [EM RECUPERAÇÃO]";
                    } else if (mediaMatematica < 5d) {
                        resultadoMatematica = " [REPROVADO]";
                    }

                    System.out.println("|==== NOTAS DO ALUNO/PADAWAN ====|");
                    System.out.printf("Notas Português\n" +
                            "I unidade: %s | II unidade: %s | III unidade: %s\n", notasPortugues[0], notasPortugues[1], notasPortugues[2]);
                    System.out.printf("Média: %s - %s\n", mediaPortugues, resultadoPortugues);
                    System.out.println(" ");

                    System.out.printf("Notas Matemática\n" +
                            "I unidade: %s | II unidade: %s | III unidade: %s\n", notasMatematica[0], notasMatematica[1], notasMatematica[2]);
                    System.out.printf("Média: %s - %s\n", mediaMatematica, resultadoMatematica);
                    break;
            }

            System.out.println(" ");
            System.out.println("|==== Quer fazer algo mais, Jedi? ====|");
            System.out.println("--------------------------------------- ");
            System.out.println("(1) - Registrar aluno/padawan;\n" +
                    "(2) - Registrar notas de Português;\n" +
                    "(3) - Registrar notas de Matemática;\n" +
                    "(4) - Mostrar informações do aluno/padawan;\n" +
                    "(5) - Mostrar notas;\n" +
                    "(6) - Encerrar sessão.");
            opcaoMenu = scan.nextInt();scan.nextLine();

        }

        scan.close();
    }

}
