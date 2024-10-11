package fundamentosdados.collections.hashmap.atualiza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtualizaSalarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler a quantidade de funcionários
        int n = scanner.nextInt();
        scanner.nextLine(); // consome a nova linha

        List<Funcionario> funcionarios = new ArrayList<>();

        // Ler os dados de cada funcionário
        for (int i = 0; i < n; i++) {
            String nome = scanner.nextLine();
            String departamento = scanner.nextLine();
            double salario = scanner.nextDouble();
            scanner.nextLine();
            funcionarios.add(new Funcionario(nome, departamento, salario));
        }

        // Ler o percentual de aumento
        double aumento = scanner.nextDouble();

        // Calcular e imprimir os novos salários com o laço for tradicional
        for (int i = 0; i < funcionarios.size(); i++) {
            // TODO: Complete o código para atualizar os salários dos funcionários
            // 1. Obtenha o funcionário atual da lista.
            Funcionario funcionario = funcionarios.get(i);
            // 2. Calcule o novo salário: novoSalario = salario * (1 + aumento / 100).
            double novoSalario = funcionario.salario * (1 + aumento / 100);
            // 3. Imprima o nome e o novo salário do funcionário no formato: "Nome: X - Novo Salario: Y".
            // 4. Certifique-se de que o novo salário seja impresso com duas casas decimais.
            System.out.printf("Nome: %s - Novo Salario: %.2f%n", funcionario.nome, novoSalario);

        }

        /*
        Outra implementação seria usar um laço foreach
        for (Funcionario funcionario : funcionarios) {
        // calcular o novo salário
        double novoSalario = funcionario.salario * (1 + aumento / 100);
        // imprimir o resultado formatado
        System.out.printf("Nome: %s - Novo Salario: %.2f%n", funcionario.nome, novoSalario);
         */

        scanner.close();
    }
}

class Funcionario {
    String nome;
    String departamento;
    double salario;

    Funcionario(String nome, String departamento, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }
}
