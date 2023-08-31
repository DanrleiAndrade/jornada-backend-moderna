package ex07;

public class Aluno {

    public static int numeroChamada; //static pertence à classe. QUando não tem static, pertence ao objeto

    public String nome1;
    public String telefone1;
    public Endereco endereco;
    public int numeroOrdem = 0;

    public Aluno(){
        gerarNumeroOrdem();
    }

    private Aluno(String nome, String telefone){
        this.nome1 = nome;
        this.telefone1 = telefone;
        gerarNumeroOrdem();
    }

    /*public Aluno(String nome, String telefone){
        this.nome1 = nome;
        this.telefone1 = telefone;
    }*/

    public static Aluno criarAlunoVazio(){
        return new Aluno();
    }

    public static Aluno criarAlunoDadosBasicos(String nome, String telefone){
        return new Aluno(nome, telefone);
    }

    /*public static void addInstancia(){
        Aluno.vezesInstancia++;
    }*/

    private void gerarNumeroOrdem(){
        Aluno.numeroChamada++;
        this.numeroOrdem = numeroChamada;
    }

    @Override
    public String toString() {
        return "Aluno [" +
                "nome1='" + nome1 + '\'' +
                ", telefone1='" + telefone1 + '\'' +
                ", endereco=" + endereco +
                ']';
    }
}
