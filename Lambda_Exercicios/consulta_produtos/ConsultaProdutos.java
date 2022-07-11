import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro filtro){
        List<Produto>produtosFiltrados = new ArrayList<>();
        for (Produto p: produtos) {
            if(filtro.testar(p)){
                produtosFiltrados.add(p);
            }
        }
        return produtosFiltrados;
    }
}
