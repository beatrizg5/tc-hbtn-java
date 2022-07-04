package provedores;

public class JadLog implements ProvedorFrete{
    @Override
    public Frete calcularFrete(double peso, double valor) {
        return ProvedorFrete.super.calcularFrete(peso, valor);
    }
}
