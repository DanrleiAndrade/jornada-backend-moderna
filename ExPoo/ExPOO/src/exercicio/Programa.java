package exercicio;

public class Programa {
    public static void main(String[] args) {

        Usuario danrlei = new Usuario();
        danrlei.nome = "Danrlei";

        Usuario andressa = new Usuario();
        andressa.nome = "Andressa";

        danrlei.realizarLancamento(1500, Usuario.CREDITO, "obs");
        danrlei.realizarLancamento(500,Usuario.CREDITO, "OBS");
        danrlei.realizarLancamento(200,Usuario.DEBITO, "obs");
        danrlei.imprimirInformacoes();

        andressa.realizarLancamento(2500, Usuario.CREDITO, "OBS");
        andressa.realizarLancamento(1000, Usuario.CREDITO, "obs");
        andressa.realizarLancamento(200, Usuario.DEBITO, "OBS");
        andressa.imprimirInformacoes();

        danrlei.transferirPara(andressa,50);
        andressa.transferirPara(danrlei,350);

        danrlei.imprimirInformacoes();
        System.out.println(" ");
        andressa.imprimirInformacoes();


        /*Usuario usuario01 = new Usuario();
        Endereco logradouro = new Endereco();

        usuario01.nome = "Neymar";
        usuario01.cpf = 11523344456L;
        usuario01.idade = 18;
        usuario01.salario = 1000.00;

        logradouro.rua = "Rua Tubarão";
        logradouro.numero = 70;
        logradouro.bairro = "Beira-mar";
        logradouro.cidade = "Águas claras";

        usuario01.endereco = logradouro;

        System.out.println("Nome: " + usuario01.nome);
        System.out.println("Idade: " + usuario01.idade);
        System.out.println("Salário: " + usuario01.salario);
        System.out.println("Endereço: " + usuario01.endereco);
        System.out.println("CPF: " + usuario01.cpf);

        //MÉTODOS

        usuario01.realizarLancamento(500,"CREDITO", "Bônus mensal");
        System.out.println("Saldo após o crédito: " + usuario01.salario);

        usuario01.realizarLancamento(400, "DEBITO", "INSS");
        System.out.println("Saldo após o débito: " + usuario01.salario);

        usuario01.imprimirInformacoes();*/


    }
}
