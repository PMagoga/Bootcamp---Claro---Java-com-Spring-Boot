package fundamentosdados.collections.hashmap.remove;

import java.util.*;

public class RemoverDuplicados {
    public static List<String> removerDuplicados(List<String> produtos) {
        // Usamos um Set para rastrear produtos já vistos, ignorando maiúsculas/minúsculas
        Set<String> vistos = new HashSet<>();

        // Lista para armazenar o resultado final com produtos únicos
        List<String> resultado = new ArrayList<>();

        // Iterar sobre a lista de produtos
        for (String produto : produtos) {
            // Converter o nome do produto para minúsculas para garantir que não haja duplicatas devido a diferenças de case
            String produtoLower = produto.toLowerCase();

            // Se o produto ainda não foi visto, adiciona à lista de resultados
            if (!vistos.contains(produtoLower)) {
                resultado.add(produto); // Adiciona o produto original
                vistos.add(produtoLower); // Marca como visto na versão minúscula
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a quantidade de produtos
        int n = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha

        // Lista para armazenar os produtos inseridos
        List<String> produtos = new ArrayList<>();

        // Leitura dos produtos inseridos pelo usuário
        for (int i = 0; i < n; i++) {
            String produto = scanner.nextLine();
            produtos.add(produto);
        }

        // Chama a função removerDuplicados e armazena o resultado
        List<String> produtosUnicos = removerDuplicados(produtos);

        // Exibe a lista de produtos únicos
        System.out.println("Produtos únicos:");
        for (String produto : produtosUnicos) {
            System.out.println(produto);
        }

        scanner.close();
    }
}
