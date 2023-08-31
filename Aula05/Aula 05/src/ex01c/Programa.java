package ex01c;

public class Programa {
    public static void main(String[] args) {
        Usuario john = new Usuario();
        john.nome = "Jon Doe";
        john.idade = 36;
        john.genero = "Masculino";
        john.cpf = "044.906.274.09";
        john.salario = 1500.00;

        System.out.printf("R$ Salario atual: %.2f\n", john.salario);
        System.out.println("adicionar valor ao salario");

        john.realizarLancamento(100, "CREDITO", "HORA EXTRA do MES");

        System.out.printf("R$ Salario atual: %.2f\n", john.salario);
        System.out.println("Subtraindo valor ao salario");

        john.realizarLancamento(500, "DEBITO", "PLANO DE SAUDE");

        System.out.printf("R$ Salario atual: %.2f\n", john.salario);
    }
}