public class Marcha {
  private int marchaAtual; // 0 = neutro
  private final int MARCHA_MAXIMA = 6;

  public Marcha() {
    this.marchaAtual = 0; // começa no neutro
  }

  public int getMarchaAtual() {
    return marchaAtual;
  }

  public boolean podeAcelerar(int novaVelocidade) {
    if (marchaAtual == 0) {
      System.out.println("Não é possível acelerar no neutro!");
      return false;
    }

    // Limites de velocidade por marcha
    int limiteMaximo = marchaAtual * 20; 
    int limiteMinimo = (marchaAtual - 1) * 20 + 1;

    if (novaVelocidade > limiteMaximo) {
      return false;
    }
    if (novaVelocidade < limiteMinimo && novaVelocidade > 0) {
      return false;
    }

    return true;
  }

  public void trocarMarcha(int novaMarcha, int velocidadeAtual) {
    // Regra para não pular marchas
    if (Math.abs(novaMarcha - marchaAtual) > 1) {
      System.out.println("Não é permitido pular marchas!");
      return;
    }

    // Limite de faixa de velocidade para a marcha
    if (novaMarcha > 0) {
      int limiteMaximo = novaMarcha * 20;
      int limiteMinimo = (novaMarcha - 1) * 20 + 1;

      if (velocidadeAtual > limiteMaximo || (velocidadeAtual < limiteMinimo && velocidadeAtual > 0)) {
        System.out.println("Velocidade incompatível com a marcha " + novaMarcha + ".");
        return;
      }
    }

    // Troca de marcha
    if (novaMarcha >= 0 && novaMarcha <= MARCHA_MAXIMA) {
      marchaAtual = novaMarcha;
      if (marchaAtual == 0) {
        System.out.println("Marcha em neutro.");
      } else {
        System.out.println("Marcha trocada para: " + marchaAtual);
      }
    } else {
      System.out.println("Marcha inválida. Escolha entre 0 e " + MARCHA_MAXIMA);
    }
  }
}
