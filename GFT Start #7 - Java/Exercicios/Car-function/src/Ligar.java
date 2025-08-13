public class Ligar {
  private boolean ligado = false;

  public boolean executar() {
    if (!ligado) {
      ligado = true;
      System.out.println("O carro foi ligado.");
    } else {
      System.out.println("O carro já está ligado.");
    }
    return ligado;
  }

  public void desligar() {
    if (ligado) {
      ligado = false;
      System.out.println("O carro foi desligado.");
    } else {
      System.out.println("O carro já está desligado.");
    }
  }

  public boolean isLigado() {
    return ligado;
  }
}
