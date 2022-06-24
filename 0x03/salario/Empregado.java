public class Empregado {
    double salarioFixo;

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    double calcularBonus(Departamento departamento){
        if(departamento.alcancouMeta()){
           return salarioFixo*0.10;
        }
        return 0.0;
    }
    double calcularSalarioTotal(Departamento departamento){
        return getSalarioFixo()+calcularBonus(departamento);
    }
}

