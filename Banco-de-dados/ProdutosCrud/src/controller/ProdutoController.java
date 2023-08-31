package controller;

public class ProdutoController {

    int produto_id;
    String desc_produto;
    String marca;
    double valor;
    String sn_ativo;

    //CONSTRUCTORS
    public ProdutoController(int produto_id, String desc_produto, String marca, double valor, String sn_ativo) {
        this.produto_id = produto_id;
        this.desc_produto = desc_produto;
        this.marca = marca;
        this.valor = valor;
        this.sn_ativo = sn_ativo;
    }

    //GETTERS and SETTERS
    public int getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(int produto_id) {
        this.produto_id = produto_id;
    }

    public String getDesc_produto() {
        return desc_produto;
    }

    public void setDesc_produto(String desc_produto) {
        this.desc_produto = desc_produto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getSn_ativo() {
        return sn_ativo;
    }

    public void setSn_ativo(String sn_ativo) {
        this.sn_ativo = sn_ativo;
    }
}
