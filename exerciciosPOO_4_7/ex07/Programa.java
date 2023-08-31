package exerciciosPOO.ex07;

public class Programa {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Thiago Sant` Anna", "81982883545");
        Endereco endereco = new Endereco(122, "Rua douradinha");
        aluno.endereco = endereco;

        System.out.printf("Nome: %s \t\t Telefone: %s\n", aluno.nome, aluno.telefone);
        System.out.printf("Endereco: %s \tnumero: %d\n", aluno.endereco.rua, aluno.endereco.numero);
    }
}
