import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        BuscaMoedas buscador = new BuscaMoedas();
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        String menu = """
                1- Dólar para Real
                2- Real para Dólar
                3- Euro para Real
                4- Real para Euro
                5- Euro para Dólar
                6- Dólar para Euro
                7- Sair""";

        while (opcao != 7) {
            System.out.println("-----------------------------");
            System.out.println("   Conversor de Moedas");
            System.out.println(menu);
            System.out.println("Digite a Opção Desejada:");

            if (!entrada.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                entrada.next();
                continue;
            }

            opcao = entrada.nextInt();

            if (opcao == 7) {
                System.out.println("Saindo...");
                break;
            }

            if (opcao < 1 || opcao > 6) {
                System.out.println("Opção inválida. Escolha uma das opções do menu.");
                continue;
            }

            System.out.println("-----------------------------");

            switch (opcao) {
                case 1:
                    System.out.println("****** Dólar para Real ******");
                    Dados dados = new Dados(buscador.buscamoedas("USD", "BRL"));
                    System.out.println("Valor do Dólar na " + dados + " Reais");
                    System.out.println("Digite o valor para converter");
                    System.out.print("USD: ");
                    new Calculadora(entrada.nextDouble(), "USD", "BRL");
                    break;

                case 2:
                    System.out.println("****** Real para Dólar ******");
                    Dados dados2 = new Dados(buscador.buscamoedas("BRL", "USD"));
                    System.out.println("Valor do Real na " + dados2 + " Dólares");
                    System.out.println("Digite o valor para converter");
                    System.out.print("BRL: ");
                    new Calculadora(entrada.nextDouble(), "BRL", "USD");
                    break;

                case 3:
                    System.out.println("****** Euro para Real ******");
                    Dados dados3 = new Dados(buscador.buscamoedas("EUR", "BRL"));
                    System.out.println("Valor do Euro na " + dados3 + " Reais");
                    System.out.println("Digite o valor para converter");
                    System.out.print("EUR: ");
                    new Calculadora(entrada.nextDouble(), "EUR", "BRL");
                    break;

                case 4:
                    System.out.println("****** Real para Euro ******");
                    Dados dados4 = new Dados(buscador.buscamoedas("BRL", "EUR"));
                    System.out.println("Valor do Real na " + dados4 + " Euros");
                    System.out.println("Digite o valor para converter");
                    System.out.print("BRL: ");
                    new Calculadora(entrada.nextDouble(), "BRL", "EUR");
                    break;

                case 5:
                    System.out.println("****** Euro para Dólar ******");
                    Dados dados5 = new Dados(buscador.buscamoedas("EUR", "USD"));
                    System.out.println("Valor do Euro na " + dados5 + " Dólares");
                    System.out.println("Digite o valor para converter");
                    System.out.print("EUR: ");
                    new Calculadora(entrada.nextDouble(), "EUR", "USD");
                    break;

                case 6:
                    System.out.println("****** Dólar para Euro ******");
                    Dados dados6 = new Dados(buscador.buscamoedas("USD", "EUR"));
                    System.out.println("Valor do Dólar na " + dados6 + " Euros");
                    System.out.println("Digite o valor para converter");
                    System.out.print("USD: ");
                    new Calculadora(entrada.nextDouble(), "USD", "EUR");
                    break;
            }
        }
    }
}
