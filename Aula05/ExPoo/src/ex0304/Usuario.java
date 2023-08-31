package ex0304;

public class Usuario {

    public String nome = null;
    public int idade = 0;
    public String genero = null;
    public  String cpf = null;
    public double salario = 0d;
    public Endereco endereco;

    public void realizarLancamento(double valor, String tipo, String observacao) {
        if(tipo.toUpperCase().equals("CREDITO")) {
            this.salario += valor;
        }
        if(tipo.toUpperCase().equals("DEBITO")) {
            this.salario -= valor;
        }
    }
}
