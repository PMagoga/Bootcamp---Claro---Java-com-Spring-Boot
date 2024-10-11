package fundamentosdados.collections.list;

import java.util.*;

public class GerenciamentoFuncionarios {
    static class Funcionario {
        int id;
        String nome;
        String cargo;

        Funcionario(int id, String nome, String cargo) {
            this.id = id;
            this.nome = nome;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return id + ": " + nome + " - " + cargo;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();


        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {

            String nome = scanner.nextLine();
            String cargo = scanner.nextLine();

            // TODO: Adicione funcionários à lista 'funcionarios':
            funcionarios.add(new Funcionario(i+1, nome, cargo));

        }

        Collections.sort(funcionarios, Comparator.comparingInt(f -> f.id));
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}