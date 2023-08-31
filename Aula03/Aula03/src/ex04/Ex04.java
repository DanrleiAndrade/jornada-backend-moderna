package ex04;

import java.util.Scanner;

public class Ex04 {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        String nome = null;
        String sexo = null;
        int idade = 0;
        int opcaoMenu;
        double notaPortugues1 = 0d;
        double notaPortugues2 = 0d;
        double notaPortugues3 = 0d;
        double mediaPortugues = 0d;
        String resultadoPortugues = null;
        double notaMatematica1 = 0d;
        double notaMatematica2 = 0d;
        double notaMatematica3 = 0d;
        double mediaMatematica = 0d;
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
                    System.out.println("Registre a primeira nota de português (x ou x,x):");
                    notaPortugues1 = scan.nextDouble();scan.nextLine();
                    System.out.println("Registre a segunda nota de português (x ou x,x):");
                    notaPortugues2 = scan.nextDouble();scan.nextLine();
                    System.out.println("Registre a terceira nota de português (x ou x,x):");
                    notaPortugues3 = scan.nextDouble();scan.nextLine();
                    break;
                case(3):
                    System.out.println("Registre a primeira nota de matemática (x ou x,x):");
                    notaMatematica1 = scan.nextDouble();scan.nextLine();
                    System.out.println("Registre a segunda nota de matemática (x ou x,x):");
                    notaMatematica2 = scan.nextDouble();scan.nextLine();
                    System.out.println("Registre a terceira nota de matemática (x ou x,x):");
                    notaMatematica3 = scan.nextDouble();scan.nextLine();
                    break;
                case(4):
                    System.out.println("|==== INFORMAÇÕES DO ALUNO/PADAWAN ====|");
                    System.out.printf("Nome: %s | Sexo: %s\n" +
                                      "Idade: %s", nome, sexo, idade);
                    break;
                case(5):
                    mediaPortugues = (notaPortugues1 + notaPortugues2 + notaPortugues3)/3;
                    mediaMatematica = (notaMatematica1 + notaMatematica2 + notaMatematica3)/3;

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
                                      "I unidade: %s | II unidade: %s | III unidade: %s\n", notaPortugues1, notaPortugues2, notaPortugues3);
                    System.out.printf("Média: %s - %s\n", mediaPortugues, resultadoPortugues);
                    System.out.println(" ");

                    System.out.printf("Notas Matemática\n" +
                            "I unidade: %s | II unidade: %s | III unidade: %s\n", notaMatematica1, notaMatematica2, notaMatematica3);
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

    }
}
