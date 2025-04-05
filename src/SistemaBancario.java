import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SistemaBancario {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome;
        String tipoConta;
        double saldo = 0;
        int opcao = 0;

        System.out.println("Digite seu nome:");
        nome = leitura.nextLine();

        System.out.println("Bem vindo " + nome + ", qual o tipo da sua conta? (corrente/poupança)");
        tipoConta = leitura.nextLine();

        System.out.println("Qual o saldo inicial?");
        saldo = leitura.nextDouble();

        System.out.println("***********************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("\nNome:            " + nome);
        System.out.println("Tipo da conta:   " + tipoConta);
        System.out.println("Saldo inicial:   "+ saldo);
        System.out.println("***********************************");

        String menu = """
                \n** Operações **
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;

        while (opcao != 4) {
            System.out.println(menu);
            System.out.println("Digite a opção que deseja realizar:");
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atual é R$" + saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor que deseja depositar:");
                double depositar = leitura.nextDouble();
                saldo += depositar;
                System.out.println("Saldo atualizado: R$" + saldo);
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir:");
                double transferir = leitura.nextDouble();

                if (transferir > saldo){
                    System.out.println("Não há saldo suficiente para realizar essa transferência.");
                } else {
                    saldo -= transferir;
                    System.out.println("Saldo após a transferência: R$" + saldo);
                }
            }
        }
    }
}