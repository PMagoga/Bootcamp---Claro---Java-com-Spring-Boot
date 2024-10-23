package fundamentosdados.collections.hashmap.filtra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FiltroProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a quantidade de produtos
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha após o inteiro

        // Lista para armazenar os produtos
        List<Produto> produtos = new ArrayList<>();

        // Lê os dados dos produtos
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome do produto:");
            String nome = scanner.nextLine();
            System.out.println("Digite a categoria do produto:");
            String categoria = scanner.nextLine();
            System.out.println("Digite o preço do produto:");
            double preco = scanner.nextDouble();
            scanner.nextLine(); // Consumir a nova linha após o double
            produtos.add(new Produto(nome, categoria, preco));
        }

        // Lê a faixa de preço
        System.out.println("Digite o preço mínimo:");
        double precoMin = scanner.nextDouble();
        System.out.println("Digite o preço máximo:");
        double precoMax = scanner.nextDouble();

        // Filtra os produtos pela faixa de preço usando Streams
        List<Produto> produtosFiltrados = produtos.stream()
                .filter(p -> p.preco >= precoMin && p.preco <= precoMax)
                .collect(Collectors.toList());

        // Exibe os produtos filtrados
        System.out.println("Produtos na faixa de preço especificada:");
        for (Produto p : produtosFiltrados) {
            System.out.printf("Nome: %s - Preço: %.2f\n", p.nome, p.preco);
        }

        scanner.close();
    }
}

class Produto {
    String nome;
    String categoria;
    double preco;

    Produto(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }
}

