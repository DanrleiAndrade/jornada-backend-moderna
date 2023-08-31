package exerciciosPOO.ex06;

public class Programa {
    public static void main(String[] args) {
        Usuario john = new Usuario();
        Usuario jane = new Usuario();

        john.nome = "Jon Doe";
        john.idade = 36;
        john.genero = "Masculino";
        john.cpf = "044.906.274.09";
        john.salario = 1500.00;

        jane.nome = "Jane Doe";
        jane.idade = 29;
        jane.genero = "Feminino";
        jane.cpf = "024.666.274.09";
        jane.salario = 2500.00;

        john.imprimirInformacoes(jane);
    }
}
