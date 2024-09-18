package explorandoapi.detectormetodo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HttpMethodCounter {
    public static String findMostFrequentMethod(String input) {
        String[] methods = input.split(",");
        Map<String, Integer> methodCounts = new HashMap<>();

        // Contar a ocorrência de cada método HTTP e armazenar no mapa 'methodCounts'
        for (String method : methods) {
            method = method.trim().toUpperCase(); // Remover espaços extras e converter para maiúsculas

            // Verifica se o método é um dos reconhecidos
            if (!method.equals("GET") && !method.equals("POST") && !method.equals("PUT") && !method.equals("DELETE")) {
                methodCounts.put(method, methodCounts.getOrDefault(method, 0) + 1);
            } else {
                methodCounts.put(method, methodCounts.getOrDefault(method, 0) + 1);
            }
        }

        // Encontrar o método com a maior contagem
        String mostFrequentMethod = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : methodCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentMethod = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        // Descrição do método
        String description = "";
        switch (mostFrequentMethod) {
            case "GET":
                description = "O GET solicita a representacao de um recurso.";
                break;
            case "POST":
                description = "O POST envia dados para processamento.";
                break;
            case "PUT":
                description = "O PUT atualiza todos os dados de um recurso.";
                break;
            case "DELETE":
                description = "O DELETE remove um recurso especifico.";
                break;
            default:
                description = "Metodo nao reconhecido.";
        }

        return mostFrequentMethod + ": " + maxCount + " - " + description;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a lista de métodos HTTP separados por vírgula:");
        String input = scanner.nextLine();
        String output = findMostFrequentMethod(input);
        System.out.println(output);
    }
}

