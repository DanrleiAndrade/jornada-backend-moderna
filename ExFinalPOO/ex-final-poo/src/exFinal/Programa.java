package exFinal;

public class Programa {
    public static void main(String[] args) {

        Mensagens.mensagemBoasVindas();
        Cliente cliente01 = Cliente.criarCliente();
        Pedido pedido01 = Pedido.escolherPedido();

        cliente01.reciboCliente();
        pedido01.reciboPedido();
        Mensagens.mensagemFinal();

    }
}
