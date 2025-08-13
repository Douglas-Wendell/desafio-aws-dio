public class Velocidade {
    private int velocidade;
    private final int VELOCIDADE_MAXIMA = 120;
    private final int incremento = 1;
    private final int decremento = 1;

    public Velocidade() {
      this.velocidade = 0;
    }

    public int velocidadeAtual() {
      return velocidade;
    }

    public void acelerar() {
      if (incremento > 0) {
        if (velocidade + incremento > VELOCIDADE_MAXIMA) {
          velocidade = VELOCIDADE_MAXIMA;
        } else {
          velocidade += incremento;
        }
        System.out.println("Acelerando. Velocidade atual: " + velocidade + " km/h");
      }
    }

    public void frear() {
      if (decremento > 0) {
        velocidade -= decremento;
        if (velocidade < 0) {
          velocidade = 0;
        }
        System.out.println("Freando. Velocidade atual: " + velocidade + " km/h");
      }
    }
}
