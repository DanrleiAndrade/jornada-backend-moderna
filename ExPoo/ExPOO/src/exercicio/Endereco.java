package exercicio;

public class Endereco {

    public String rua;
    public int numero;
    public String bairro;
    public String cidade;

    @Override
    public String toString() {
        return  "Rua='" + rua + '\'' +
                ", Numero=" + numero +
                ", Bairro='" + bairro + '\'' +
                ", Cidade='" + cidade + '\'';
    }
}
