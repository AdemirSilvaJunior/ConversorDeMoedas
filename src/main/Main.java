package main;

import service.ConversorMoedas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorMoedas conversor = new ConversorMoedas();

        while (true) {
            System.out.println("Escolha a opção de conversão de moeda:");
            System.out.println("1. Dólar (USD) para Real (BRL)");
            System.out.println("2. Real (BRL) para Dólar (USD)");
            System.out.println("3. Euro (EUR) para Real (BRL)");
            System.out.println("4. Real (BRL) para Euro (EUR)");
            System.out.println("5. Libra Esterlina (GBP) para Real (BRL)");
            System.out.println("6. Real (BRL) para Libra Esterlina (GBP)");
            System.out.println("7. Sair");
            int opcao = scanner.nextInt();

            if (opcao == 7) {
                break;
            }

            System.out.println("Digite o valor que deseja converter:");
            double valor = scanner.nextDouble();

            double resultado = conversor.converter(opcao, valor);

            String moedaInicial = getMoedaInicial(opcao);
            String moedaAlvo = getMoedaAlvo(opcao);

            int centavos = (int) Math.round((resultado - Math.floor(resultado)) * 100);

            System.out.printf("%.2f %s corresponde a %.0f %s com %d centavos.%n",
                    valor, moedaInicial, resultado, moedaAlvo, centavos);

            // Aguardar que o usuário pressione Enter para continuar
            System.out.println("Pressione Enter para continuar...");
            scanner.nextLine(); // Limpar o buffer de entrada
            scanner.nextLine(); // Aguardar a entrada do usuário (Enter)
        }

        scanner.close();
    }

    private static String getMoedaInicial(int opcao) {
        return switch (opcao) {
            case 1 -> "USD"; // Dólar para Real
            case 2 -> "BRL"; // Real para Dólar
            case 3 -> "EUR"; // Euro para Real
            case 4 -> "BRL"; // Real para Euro
            case 5 -> "GBP"; // Libra para Real
            case 6 -> "BRL"; // Real para Libra
            default -> "";
        };
    }

    private static String getMoedaAlvo(int opcao) {
        return switch (opcao) {
            case 1 -> "BRL"; // Dólar para Real
            case 2 -> "USD"; // Real para Dólar
            case 3 -> "BRL"; // Euro para Real
            case 4 -> "EUR"; // Real para Euro
            case 5 -> "BRL"; // Libra para Real
            case 6 -> "GBP"; // Real para Libra
            default -> "";
        };
    }
}
