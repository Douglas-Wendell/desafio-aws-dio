import java.util.Scanner;

public class CarFunction {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Ligar carro = new Ligar();
    Marcha marcha = new Marcha();
    Velocidade velocidade = new Velocidade();

    int opcao;

    do {
      System.out.println("\nEscolha uma função para realizar:");
      System.out.println("1. Ligar");
      System.out.println("2. Desligar");
      System.out.println("3. Acelerar");
      System.out.println("4. Frear");
      System.out.println("5. Virar");
      System.out.println("6. Verificar velocidade");
      System.out.println("7. Trocar marcha");
      System.out.println("0. Sair");
      System.out.print("Opção: ");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          carro.executar();
          break;
        case 2:
          carro.desligar();
          break;
        default:
          if (!carro.isLigado()) {
            System.out.println("O carro está desligado. Ligue o carro antes.");
            break;
          }
          // Se chegou aqui, significa que está ligado
          switch (opcao) {
            case 3:
              velocidade.acelerar();
              break;
            case 4:
              velocidade.frear();
              break;
            case 5:
              if (velocidade.velocidadeAtual() > 0 && velocidade.velocidadeAtual() <= 40) {
                System.out.println("Escolha o lado. (E/D)");
                String lado = scanner.next();
                if (lado.equalsIgnoreCase("E")) {
                  System.out.println("Virando à esquerda.");
                } else if (lado.equalsIgnoreCase("D")) {
                  System.out.println("Virando à direita.");
                } else {
                  System.out.println("Lado inválido. Escolha 'E' ou 'D'.");
                }
              }
              break;
            case 6:
              System.out.println("Velocidade atual: " + velocidade.velocidadeAtual() + " km/h");
              break;
            case 7:
              System.out.print("Escolha a nova marcha (0 = neutro, 1 a 6): ");
              int novaMarcha = scanner.nextInt();
              marcha.trocarMarcha(novaMarcha, velocidade.velocidadeAtual());
              break;
            case 0:
              System.out.println("Você escolheu sair.");
              break;
            default:
              System.out.println("Opção inválida.");
          }
      }
    } while (opcao != 0);

    scanner.close();
  }
}