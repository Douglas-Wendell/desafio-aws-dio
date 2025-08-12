public class Saldo {
  private double saldo;

  public Saldo(double saldoInicial) {
    this.saldo = saldoInicial;
  }

  public double getSaldo() {
    return saldo;
  }

  public void depositar(double valorDeposito) {
    saldo += valorDeposito;
  }

  public boolean sacar(double valorSaque) {
    if (valorSaque <= saldo) {
      saldo -= valorSaque;
      return true;
    }
    return false;
  }
}
