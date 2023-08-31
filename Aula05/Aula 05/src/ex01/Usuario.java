package ex01;

public class Usuario {

    public String nome;
    public int idade;
    public String genero;
    public String cpf;
    public double salario;
    public boolean situacaoCadastro = true;

    public void realizarLancamento(double valor, String tipo, String observacao){
        if (valor <= 0){
            System.out.println("Valor inválido.");
        } else {
            if (tipo.equals("Crédito")){
                this.salario += valor;
            }else {
                this.salario -= valor;
            }
        }

    }

    public void imprimirInformacoes(){}

    public void imprimirInformacoesDeUmUsuario(Usuario user01){
        System.out.println("Nome: " + user01.nome);
    }



    }

