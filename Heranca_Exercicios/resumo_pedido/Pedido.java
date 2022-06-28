import produtos.Dvd;
import produtos.Livro;
import java.util.Locale;

public class Pedido {
    Locale locale = new Locale("pt","BR");
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public void apresentarResumoPedido() {

        System.out.println("------- RESUMO PEDIDO -------");
        for (ItemPedido iten : itens) {

            System.out.printf(locale,"Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n",
                    iten.getProduto().getClass().getSimpleName(), iten.getProduto().getTitulo(),
                    iten.getProduto().obterPrecoLiquido(), iten.getQuatidade(), (iten.getProduto().obterPrecoLiquido() * iten.getQuatidade()));
        }
        System.out.println("----------------------------");
        System.out.printf(locale,"DESCONTO: %.2f\n", getPercentualDesconto());
        System.out.printf(locale,"TOTAL PRODUTOS: %.2f\n", totalProdutos());
        System.out.println("----------------------------");
        System.out.printf(locale,"TOTAL PEDIDO: %.2f\n", calcularTotal());
        System.out.println("----------------------------");
    }

    private double totalProdutos() {
        double totalProdutos = calcularTotal();
        return totalProdutos + getPercentualDesconto();
    }

    public double calcularTotal() {

        double total = 0;
        for (ItemPedido item : itens) {
            total = total + (item.getQuatidade() * item.getProduto().obterPrecoLiquido());

        }

        return total - total * this.percentualDesconto / 100;

    }

    public double getPercentualDesconto() {
        double desconto = 0;
        for (ItemPedido item : itens) {
            desconto = desconto + (item.getQuatidade() * item.getProduto().obterPrecoLiquido());

        }

        return desconto = desconto * this.percentualDesconto / 100;

    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }
}
