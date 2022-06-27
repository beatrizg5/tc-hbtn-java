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

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0;
    }

    void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");

        } else {
            saldo += valor;
        }

    }

    void sacar(double valor) throws OperacaoInvalidaException {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
            } else {
                throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
            }
        } else {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }
    }


    double calcularTarifaMensal() {
        if (saldo * 0.10 < 10) {
            return saldo * 0.10;
        }
        return 10;

    }

    double calcularJurosMensal() {
        if (saldo < 0) {

            return 0;
        } else {
            return (taxaJurosAnual / 100) / 12;
        }
    }

    void aplicarAtualizacaoMensal() {
        double juros = calcularJurosMensal() * saldo;
        saldo -= calcularTarifaMensal();
        saldo += juros;

    }
}
