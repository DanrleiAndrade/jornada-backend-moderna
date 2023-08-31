package exercicio;

public class Usuario {
    public static final String CREDITO = "CREDITO";
    public static final String DEBITO = "DEBITO";

    public String nome;
    public int idade;
    public long cpf;
    public double salario;
    public Endereco endereco;

    public void realizarLancamento (double valor, String tipo, String observacao){
        if(tipo.toUpperCase().equals(CREDITO)) {
            this.salario += valor;
        }
        if(tipo.toUpperCase().equals(DEBITO)) {
            this.salario -= valor;
        }
        System.out.println("Lançamento realizado");
    }

    public void transferirPara(Usuario usuarioDestino, double valor){
        this.realizarLancamento(valor, Usuario.DEBITO, "Transferência");
        usuarioDestino.realizarLancamento(valor, Usuario.CREDITO, "Transferência");
    }

    public void imprimirInformacoes (){
        System.out.println(" ");
        System.out.println("====== Impressão com método ======");
        System.out.printf("Nome do usuário: %s\n", nome);
        System.out.printf("CPF: %s\n", cpf);
        System.out.printf("Idade: %s\n", idade);
        System.out.printf("Endereço: %s\n", endereco);
        System.out.printf("Salários (após lançamentos): %s\n", salario);
    }

}
