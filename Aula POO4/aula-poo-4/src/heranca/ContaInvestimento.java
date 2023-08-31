package heranca;

public class ContaInvestimento extends Conta {

    private double taxa;

    @Override
    public void sacar(double valor) {
        super.setSaldo(super.getSaldo() - (valor + this.taxa));
        System.out.println("CI: Sacado, Saldo atual: " + super.getSaldo());
    }

    public ContaInvestimento(String numeroConta, String numeroAgencia, double saldo, double taxa) {
        super(numeroConta, numeroAgencia, saldo);
        this.taxa = taxa;
        System.out.println("Criada conta de investimento");
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public String toString() {
        return "Containvestimento{" +
                "taxa=" + taxa +
                "Numero da conta=" + super.getNumeroConta() +
                "Numero da agencia=" + super.getNumeroAgencia() +
                "Saldo=" + super.getSaldo() +
                '}';
    }
}
