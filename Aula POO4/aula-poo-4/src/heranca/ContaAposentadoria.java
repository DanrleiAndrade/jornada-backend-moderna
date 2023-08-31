package heranca;

public class ContaAposentadoria extends Conta {

    private double rendimento;

    @Override
    public void depositar(double valor){
        super.setSaldo(super.getSaldo() + (valor + this.rendimento));
        System.out.println("CA: Depositado, Saldo atual: " + super.getSaldo());
    }

    public ContaAposentadoria(String numeroConta, String numeroAgencia, double saldo, double rendimento) {
        super(numeroConta, numeroAgencia, saldo);
        this.rendimento = rendimento;
        System.out.println("Criada uma conta aposentadoria");
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    @Override
    public String toString() {
        return "ContaAposentadoria{" +
                "rendimento=" + rendimento +
                "Numero da conta=" + super.getNumeroConta() +
                "Numero da agencia=" + super.getNumeroAgencia() +
                "Saldo=" + super.getSaldo() +
                '}';
    }
}
