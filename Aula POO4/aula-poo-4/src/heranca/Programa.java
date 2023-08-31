package heranca;

public class Programa {
    public static void main(String[] args) {

        ContaAposentadoria aposentadoria = new ContaAposentadoria("1010-2","058",0, 10);

        aposentadoria.depositar(100);
        System.out.println(aposentadoria.getSaldo());
    }
}
