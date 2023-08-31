package exerciciosPOO.ex07;

public class Endereco {
    public int numero;
    public String rua;
    public String complemento;
    public String cep;

    public Endereco() {}

    public Endereco(int numero, String rua) {
        this.rua = rua;
        this.numero = numero;
    }
}
