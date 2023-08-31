package exerciciosPOO.ex04;


public class Programa {
    public static void main(String[] args) {
        Usuario john = new Usuario();

        john.nome = "Jon Doe";
        john.idade = 36;
        john.genero = "Masculino";
        john.cpf = "044.906.274.09";
        john.salario = 1500.00;

        john.imprimirInformacoes();
    }
}
