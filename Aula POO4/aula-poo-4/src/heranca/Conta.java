package heranca;

public class Conta {

    private String numeroConta;
    private String numeroAgencia;
    private double saldo;

    public void sacar(double valor){
        this.saldo -= valor;
        System.out.println("CC: Sacado, Saldo atual: " + this.saldo);
    }

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("CC: Depositado, Saldo atual: " + this.saldo);
    }

    public Conta(String numeroConta, String numeroAgencia, double saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroConta='" + numeroConta + '\'' +
                ", numeroAgencia='" + numeroAgencia + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
