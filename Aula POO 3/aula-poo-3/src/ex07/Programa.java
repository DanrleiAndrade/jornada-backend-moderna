package ex07;

public class Programa {
    public static void main(String[] args) {

        Aluno aluno = Aluno.criarAlunoVazio();

        //Aluno aluno1 = Aluno.criarAlunoDadosBasicos("Boris","819998-8877");
        //System.out.println(Aluno.numeroChamada);
        Aluno aluno2 = Aluno.criarAlunoDadosBasicos("Anastácia","819558-8877");
        //System.out.println(Aluno.numeroChamada);
        //Aluno aluno3 = Aluno.criarAlunoDadosBasicos("Anne","816848-8877");
        //System.out.println(Aluno.numeroChamada);

        //System.out.println(aluno1.numeroOrdem);
        //System.out.println(aluno2.numeroOrdem);
        //System.out.println(aluno3.numeroOrdem);

        //System.out.println(aluno1.numeroChamada);

        Endereco endereco1 = new Endereco();
        Endereco endereco2  = new Endereco("Camelo",502);



    }
}
