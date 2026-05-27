package br.edu.ifpb.ads.padroes.atv2;


public class VisitorImpressaoValores implements Visitor {


    @Override
    public void visitar(ProdutoFisico produto) {
        System.out.printf("Produto Físico: %s | Valor: R$ %.2f%n",
                produto.getNome(), produto.getValor());
    }


    @Override
    public void visitar(Servico servico) {
        System.out.printf("Serviço: %s | Valor: R$ %.2f%n",
                servico.getNome(), servico.getValor());
    }
}
