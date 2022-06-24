public class Gerente extends Empregado {
    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta()) {
            return getSalarioFixo() * 0.20 + 0.01 * (departamento.valorAtingidoMeta - departamento.valorMeta);
        }
        return 0.0;
    }
}
