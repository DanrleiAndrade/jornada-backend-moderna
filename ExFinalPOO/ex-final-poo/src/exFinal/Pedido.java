package exFinal;

import java.util.Scanner;

public class Pedido {

    Scanner scanPedido = new Scanner(System.in);

    private int tipoHamburguer;
    private boolean verdura;
    private boolean molho;
    private boolean queijo;
    private int tentativasCarne = 1;
    private int tentativasVerdura = 1;
    private int tentativasMolho = 1;
    private int tentativasQueijo = 1;

    private Pedido (){
        selecaoCarne();
        selecaoVerdura();
        selecaoMolho();
        selecaoQueijo();
    }

    private void selecaoCarne(){
        System.out.println("\nEscolha seu tipo de hambúrguer (digite 1 ou 2):\n" +
                "(1) Carne\n" +
                "(2) Frango");
        tipoHamburguer = scanPedido.nextInt();scanPedido.nextLine();
        while (tentativasCarne <= 3){
            tentativasCarne++;
            if (tipoHamburguer == 1){
                System.out.println("\nCarne adicionada!");
                break;
            } else if (tipoHamburguer == 2) {
                System.out.println("\nFrango adicionado!");
                break;
            }else {
                System.out.println("Escolha uma opção válida.");
            }
            System.out.println("\nEscolha seu tipo de hambúrguer (digite 1 ou 2):\n" +
                    "(1) Carne\n" +
                    "(2) Frango");
            tipoHamburguer = scanPedido.nextInt();scanPedido.nextLine();
        }
    }

    private void selecaoVerdura(){
        System.out.println(
                "\nDeseja adicionar verdura?\n" +
                "(digite 'sim' ou 'não'):");
        String opcaoVerdura = scanPedido.nextLine();
        while(tentativasVerdura <= 3){
            tentativasVerdura++;
            if (opcaoVerdura.equals("sim")){
                this.verdura = true;
                System.out.println("Verdura adicionada!");
                break;
            } else if (opcaoVerdura.equals("não")) {
                this.verdura = false;
                System.out.println("Sem verdura!");
                break;
            } else {
                System.out.println("Insira uma opção válida, por favor.");
            }
            System.out.println("\nDeseja adicionar verdura?\n" +
                    "(digite 'sim' ou 'não'):");
            opcaoVerdura = scanPedido.nextLine();
        }
    }

    private void selecaoMolho(){
        System.out.println(
                "\nDeseja adicionar molho?\n" +
                        "(digite 'sim' ou 'não'):");
        String opcaoMolho = scanPedido.nextLine();
        while(tentativasMolho <= 3){
            tentativasMolho++;
            if (opcaoMolho.equals("sim")){
                this.molho = true;
                System.out.println("Molho adicionado!");
                break;
            } else if (opcaoMolho.equals("não")) {
                this.molho = false;
                System.out.println("Sem molho!");
                break;
            } else {
                System.out.println("Insira uma opção válida, por favor.");
            }
            System.out.println("\nDeseja adicionar molho?\n" +
                    "(digite 'sim' ou 'não'):");
            opcaoMolho = scanPedido.nextLine();
        }
    }

    private void selecaoQueijo(){
        System.out.println(
                "\nDeseja adicionar queijo?\n" +
                        "(digite 'sim' ou 'não'):");
        String opcaoQueijo = scanPedido.nextLine();
        while(tentativasQueijo <= 3){
            tentativasQueijo++;
            if (opcaoQueijo.equals("sim")){
                this.queijo = true;
                System.out.println("Queijo adicionado!");
                break;
            } else if (opcaoQueijo.equals("não")) {
                this.queijo = false;
                System.out.println("Sem queijo!");
                break;
            } else {
                System.out.println("Insira uma opção válida, por favor.");
            }
            System.out.println("\nDeseja adicionar queijo?\n" +
                    "(digite 'sim' ou 'não'):");
            opcaoQueijo = scanPedido.nextLine();
        }
    }

    protected static Pedido escolherPedido(){
        return new Pedido();
    }

    protected void reciboPedido(){
        System.out.println("\n------ Resumo do Pedido ------");
        if (tipoHamburguer == 1){
            System.out.println("Hambúguer de carne.");
        }else if (tipoHamburguer == 2){
            System.out.println("Hambúguer de frango.");
        }

        if (verdura = true){
            System.out.println("Com verdura;");
        } else if (verdura = false) {
            System.out.println("Sem verdura;");
        }

        if (molho = true){
            System.out.println("Com molho;");
        } else if (molho = false) {
            System.out.println("Sem molho;");
        }

        if (queijo = true){
            System.out.println("Com queijo;");
        } else if (queijo = false) {
            System.out.println("Sem queijo;");
        }

    }

}
