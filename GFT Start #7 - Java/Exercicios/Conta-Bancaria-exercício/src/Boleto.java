public class Boleto {
  public boolean pagarBoleto(double valor, Saldo saldo, ChequeEspecial chequeEspecial) {
    return chequeEspecial.sacar(valor, saldo);
  }
}

