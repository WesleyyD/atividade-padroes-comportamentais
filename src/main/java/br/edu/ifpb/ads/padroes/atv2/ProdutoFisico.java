package br.edu.ifpb.ads.padroes.atv2;


public class ProdutoFisico implements ItemTributavel {


    private final String nome;
    private final double valor;


    public ProdutoFisico(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }


    public String getNome() {
        return nome;
    }


    public double getValor() {
        return valor;
    }


    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitar(this);
    }
}
