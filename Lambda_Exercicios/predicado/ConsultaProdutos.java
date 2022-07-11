import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> predicate){
        List<Produto>produtosFiltrados = new ArrayList<>();
        for (Produto p: produtos) {
            if(predicate.test(p)){
                produtosFiltrados.add(p);
            }
        }
        return produtosFiltrados;
    }
}
