package br.edu.ifpb.ads.padroes.atv2;


import java.util.List;


public class Main {


    public static void main(String[] args) {
        List<ItemTributavel> itens = List.of(
                new ProdutoFisico("Notebook", 3500.00),
                new ProdutoFisico("Teclado Mecânico", 450.00),
                new Servico("Consultoria em TI", 2000.00),
                new Servico("Manutenção de Rede", 800.00)
        );


        System.out.println("xxx Impressão de Valores xxx");
        Visitor impressao = new VisitorImpressaoValores();
        for (ItemTributavel item : itens) {
            item.aceitar(impressao);
        }


        System.out.println("\nxxx Relatório de Impostos xxx");
        Visitor relatorio = new VisitorRelatorioImpostos();
        for (ItemTributavel item : itens) {
            item.aceitar(relatorio);
        }
    }
}
