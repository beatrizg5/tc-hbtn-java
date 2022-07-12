import java.util.ArrayList;
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
}
