package exerciciosPOO.ex05;

public class Usuario {
    final static String OBSERVACAOTRANSFERENCIA = "TRANSFERENCIA_ENTRE_CONTAS";

    public String nome;
    public int idade;
    public String genero;
    public String cpf;
    public double salario;

    public void realizarLancamento(double valor, String tipo, String observacao) {
        if (tipo.toUpperCase().equals("CREDITO")) {
            this.salario += valor;
        }

        if (tipo.toUpperCase().equals("DEBITO")) {
            this.salario -= valor;
        }
    }

    public void imprimirInformacoes() {
        System.out.println("--------------------- Dados -----------------------------");
        System.out.printf("Nome: %s\t\t\tIdade: %d\t\tGenero: %s\n", this.nome, this.idade,
                this.genero);
        System.out.printf("CPF: %s  \t\t Salario: R$ %.2f\n", this.cpf, this.salario);
    }

    public void transferirPara(Usuario usuario, double valor) {
        this.realizarLancamento(valor, "credito", OBSERVACAOTRANSFERENCIA);
        usuario.realizarLancamento(valor, "credito", OBSERVACAOTRANSFERENCIA);
    }

}
