package br.edu.ifpb.ads.padroes.atv2;


public class VisitorRelatorioImpostos implements Visitor {


    private static final double ALIQUOTA_PRODUTO_FISICO = 0.10;
    private static final double ALIQUOTA_SERVICO = 0.15;


    @Override
    public void visitar(ProdutoFisico produto) {
        double imposto = produto.getValor() * ALIQUOTA_PRODUTO_FISICO;
        System.out.printf("Produto Físico: %s | Valor: R$ %.2f | Imposto (10%%): R$ %.2f%n",
                produto.getNome(), produto.getValor(), imposto);
    }


    @Override
    public void visitar(Servico servico) {
        double imposto = servico.getValor() * ALIQUOTA_SERVICO;
        System.out.printf("Serviço: %s | Valor: R$ %.2f | Imposto (15%%): R$ %.2f%n",
                servico.getNome(), servico.getValor(), imposto);
    }
}
