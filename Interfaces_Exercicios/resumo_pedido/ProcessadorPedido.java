import provedores.ProvedorFrete;

public class ProcessadorPedido implements ProvedorFrete{
    public ProvedorFrete provedorFrete;

    public ProcessadorPedido(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }
    public void processar(Pedido pedido){

    }
}
