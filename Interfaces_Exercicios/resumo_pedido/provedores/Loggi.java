package provedores;

public class Loggi implements ProvedorFrete{
    @Override
    public Frete calcularFrete(double peso, double valor) {
        return ProvedorFrete.super.calcularFrete(peso, valor);
    }
}
