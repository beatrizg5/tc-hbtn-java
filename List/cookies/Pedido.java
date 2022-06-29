import java.util.ArrayList;

public class Pedido {
    private ArrayList<PedidoCookie> cookies = new ArrayList<>();

    public Pedido() {
        this.cookies = new ArrayList<PedidoCookie>();

    }


    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas() {
        int quantidadeTotal = 0;
        for (int i = 0; i < cookies.size(); i++) {
            PedidoCookie c = cookies.get(i);
            quantidadeTotal += c.getQuantidadeCaixas();

        }

        return quantidadeTotal;
    }

    public int removerSabor(String sabor) {
        int quantidadeCaixas = 0;
        for (int i = 0; i < cookies.size(); i++) {
            PedidoCookie c = cookies.get(i);
            if (c.getSabor().equals(sabor)) {
                quantidadeCaixas += c.getQuantidadeCaixas();
                cookies.remove(c);
            }
        }
        return quantidadeCaixas;
    }

}
