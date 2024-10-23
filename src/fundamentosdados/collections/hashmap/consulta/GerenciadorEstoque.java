package fundamentosdados.collections.hashmap.consulta;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorEstoque {

    // Map de produtos com suas quantidades
    private static final Map<String, Integer> produtosEstoque = new HashMap<>();

    static {
        // Inicializando o estoque com alguns produtos
        produtosEstoque.put("Switch", 10);
        produtosEstoque.put("Roteador", 0);
        produtosEstoque.put("Teclado", 25);
        produtosEstoque.put("Mouse", 10);
        produtosEstoque.put("Servidor", 5);
    }

    public static String consultarProduto(String nomeProduto) {
        // Verifica se o produto está no estoque
        // TODO: Verifique se o produto está no estoque:
        // 1. Cheque se o produto está presente no HashMap 'produtosEstoque'.
        // 2. Se estiver, verifique se a quantidade é maior que zero e retorne "Produto disponivel: X em estoque."
        // 3. Se a quantidade for zero, retorne "Produto indisponivel: X em estoque."
        // 4. Se o produto não estiver presente no HashMap, retorne "Produto nao encontrado."
        if (produtosEstoque.containsKey(nomeProduto)) {
            int quantidade = produtosEstoque.get(nomeProduto);
            if (quantidade > 0) {
                return "Produto disponível: " + quantidade + " em estoque.";
            } else {
                return "Produto indisponível.";
            }
        } else {
            return "Produto nao encontrado.";
        }
    }

    public
