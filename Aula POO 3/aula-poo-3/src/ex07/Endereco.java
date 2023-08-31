package ex07;

public class Endereco {

    public int numero1;
    public String rua1;

    public Endereco(){}

    public Endereco(String rua, int numero){
        this.rua1 = rua;
        this.numero1 = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "numero1=" + numero1 +
                ", rua1='" + rua1 + '\'' +
                '}';
    }
}
