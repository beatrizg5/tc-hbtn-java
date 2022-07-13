import java.util.Comparator;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class Consulta {
    public static List<Produto>obterLivrosDoPedido(Pedido pedido){
        List<Produto>listaProdutos = pedido.getProdutos();
        return listaProdutos.stream().filter(produto -> produto.getCategoria() == CategoriaProduto.LIVRO).collect(toList());
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        return produtos.stream().sorted(Comparator.comparing(Produto::getPreco).reversed()).findFirst().get();
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double precoMin) {
        return produtos.stream().filter(produto -> produto.getPreco() >= precoMin).collect(toList());
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {
        return pedidos.stream().filter(pedido -> pedido.getProdutos().stream().anyMatch(produto ->
                produto.getCategoria() == CategoriaProduto.ELETRONICO)).collect(toList());
    }

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {
        return produtos.stream().map(produto -> {
            if(produto.getCategoria() == CategoriaProduto.ELETRONICO) {
                produto.setPreco(produto.getPreco() - produto.getPreco() * 15/100);
            }
            return produto;
        }).collect(toList());
    }
}
