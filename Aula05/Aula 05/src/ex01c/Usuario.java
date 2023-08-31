package ex01c;

public class Usuario {
    public String nome;
    public int idade;
    public String genero;
    public  String cpf;
    public double salario;
    public void realizarLancamento(double valor, String tipo, String observacao) {
        if(tipo.toUpperCase().equals("CREDITO")) {
            this.salario += valor;
        }
        if(tipo.toUpperCase().equals("DEBITO")) {
            this.salario -= valor;
        }
    }
}