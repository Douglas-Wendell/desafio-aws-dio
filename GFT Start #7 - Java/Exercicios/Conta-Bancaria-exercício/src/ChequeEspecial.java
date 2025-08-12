public class ChequeEspecial {
  private double limiteChequeEspecial;
  private double saldoUtilizado;

  public ChequeEspecial(double saldoInicial) {
    calcularChequeEspecial(saldoInicial);
    this.saldoUtilizado = 0;
  }

  private void calcularChequeEspecial(double saldoInicial) {
    if (saldoInicial <= 500) {
      this.limiteChequeEspecial = 50;
    } else {
      this.limiteChequeEspecial = saldoInicial * 0.5;
    }
  }

  public double getLimiteChequeEspecial() {
    return limiteChequeEspecial;
  }

  public double getSaldoUtilizado() {
    return saldoUtilizado;
  }

  public boolean sacar(double valor, Saldo saldo) {
    if (valor <= saldo.getSaldo() + limiteChequeEspecial - saldoUtilizado) {
      if (valor > saldo.getSaldo()) {
        saldoUtilizado += (valor - saldo.getSaldo());
        saldo.sacar(saldo.getSaldo());
      } else {
        saldo.sacar(valor);
      }
      return true;
    }
    return false;
  }

  public void depositar(double valor, Saldo saldo) {
    if (saldoUtilizado > 0) {
      if (valor >= saldoUtilizado) {
        valor -= saldoUtilizado;
        saldoUtilizado = 0;
      } else {
        saldoUtilizado -= valor;
        valor = 0;
      }
    }
    if (valor > 0) {
      saldo.depositar(valor);
    }
  }
}
