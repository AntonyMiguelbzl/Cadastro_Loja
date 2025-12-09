import Tipos.Camiseta;
import Tipos.CamisetaEstampada;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas camisetas você deseja cadastrar? : ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantidade; i++) {

            System.out.println("          Cadastro Feito #" + (i + 1));


            System.out.print("Digite a cor da camiseta: ");
            String cor = sc.nextLine();

            System.out.print("Digite o tamanho da camiseta (PP/P/M/G/GG): ");
            String tamanho = sc.nextLine();

            System.out.print("Digite o preço Original do Produto: ");
            double preco = sc.nextDouble();
            sc.nextLine();

            System.out.print("É uma camiseta estampada? (s/n): ");
            String ch = sc.nextLine();

            Camiseta camiseta;

            if (ch.equalsIgnoreCase("s")) {
                camiseta = new CamisetaEstampada(cor, tamanho, preco);
            } else {
                camiseta = new Camiseta(cor, tamanho, preco);
            }

            System.out.println("\n----- Detalhe Do Pedido -----");
            System.out.println("Tipo: " + (camiseta instanceof CamisetaEstampada ? "Estampada" : "Sem Estampada"));
            System.out.println("Cor: " + Camiseta.getCor());
            System.out.println("Tamanho: " + camiseta.getTamanho());
            System.out.printf("Preço Original: R$ %.2f%n", Camiseta.getPreco());
            System.out.printf("Preço com Desconto: R$ %.2f%n", camiseta.calcularDesconto());
            System.out.println("--------------------------------------");
        }

        sc.close();
    }
}