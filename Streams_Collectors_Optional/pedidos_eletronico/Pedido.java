import java.util.List;

public class Pedido {
    public int codigo;
    public List<Produto> produtos;
    public Cliente cliente;

    @Override
    public String toString() {
        return String.format("[%d] %s",codigo, cliente.nome);
    }

    public Pedido(int codigo, List<Produto> produtos, Cliente cliente) {
        this.codigo = codigo;
        this.produtos = produtos;
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
