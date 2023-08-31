package exerciciosPOO.ex07;

public class Aluno {
    public String nome;
    public int idade;
    public String genero;
    public String telefone;
    public Endereco endereco;

    public Aluno() {}

    public Aluno(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
}
