import java.util.Scanner;

public class Conta {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o saldo inicial da conta: R$ ");
    double saldoInicial = scanner.nextDouble();

    Saldo saldo = new Saldo(saldoInicial);
    ChequeEspecial chequeEspecial = new ChequeEspecial(saldoInicial);
    Boleto boleto = new Boleto();

    while (true) {
      System.out.println("\n=== MENU ===");
      System.out.println("1 - Consultar saldo");
      System.out.println("2 - Consultar cheque especial");
      System.out.println("3 - Depositar dinheiro");
      System.out.println("4 - Sacar dinheiro");
      System.out.println("5 - Pagar boleto");
      System.out.println("6 - Verificar uso do cheque especial");
      System.out.println("0 - Sair");
      System.out.print("Escolha uma opção: ");
      int operacao = scanner.nextInt();

      switch (operacao) {
        case 1:
          System.out.println("Saldo atual: R$ " + saldo.getSaldo());
          break;

        case 2:
          System.out.println("Limite do cheque especial: R$ " + chequeEspecial.getLimiteChequeEspecial());
          System.out.println("Valor utilizado: R$ " + chequeEspecial.getSaldoUtilizado());
          System.out.println("Limite disponível: R$ " + (chequeEspecial.getLimiteChequeEspecial() - chequeEspecial.getSaldoUtilizado()));
          break;

        case 3:
          System.out.print("Digite o valor a depositar: R$ ");
          double valorDeposito = scanner.nextDouble();
          chequeEspecial.depositar(valorDeposito, saldo);
          System.out.println("Depósito realizado. Saldo atual: R$ " + saldo.getSaldo());
          System.out.println("Cheque especial utilizado: R$ " + chequeEspecial.getSaldoUtilizado());
          break;

        case 4:
          System.out.print("Digite o valor a sacar: R$ ");
          double valorSaque = scanner.nextDouble();

          if (!chequeEspecial.sacar(valorSaque, saldo)) {
            System.out.println("Saldo insuficiente e limite do cheque especial estourado.");
          } else {
            System.out.println("Saque realizado com sucesso.");
          }
          break;

        case 5:
          System.out.print("Digite o valor do boleto: R$ ");
          double valorBoleto = scanner.nextDouble();

          if (!chequeEspecial.sacar(valorBoleto, saldo)) {
            System.out.println("Saldo insuficiente para pagamento do boleto.");
          } else {
            System.out.println("Boleto pago com sucesso.");
          }
          break;

        case 6:
          if (chequeEspecial.getSaldoUtilizado() > 0) {
            System.out.println("A conta está usando R$ " + chequeEspecial.getSaldoUtilizado() + " do cheque especial.");
          } else {
            System.out.println("A conta não está usando o cheque especial.");
          }
          break;

        case 0:
          System.out.println("Encerrando sistema. Até logo!");
          scanner.close();
          return;

        default:
          System.out.println("Operação inválida. Tente novamente.");
          break;
      }
    }
  }
}
