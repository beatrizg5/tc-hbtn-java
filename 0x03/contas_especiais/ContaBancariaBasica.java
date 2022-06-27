import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {

    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0;
    }

    void depositar(double valor) throws OperacaoInvalidaException {
        if (valor < 0) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");

        } else {
            this.saldo += valor;
        }

    }

    void sacar(double valor) throws OperacaoInvalidaException {
        if (valor > 0) {
            if (valor <= this.saldo) {
                this.saldo -= valor;
            } else {
                throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
            }
        } else {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }
    }


    double calcularTarifaMensal() {
        double tarifa = 0;
        tarifa = this.saldo * 0.10;
        if (tarifa < 10) {
            return tarifa;
        } else {
            return 10;
        }

    }

    double calcularJurosMensal() {
        if (this.saldo < 0) {

            return 0;
        } else {
            return (taxaJurosAnual / 100) / 12;
        }
    }

    void aplicarAtualizacaoMensal() {
        double juros = calcularJurosMensal() * this.saldo;
        this.saldo -= calcularTarifaMensal();
        this.saldo += juros;

    }
}
