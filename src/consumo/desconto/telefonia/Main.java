package consumo.desconto.telefonia;

import java.util.Scanner;

class ComboServico {
    private double telefoniaMovel;
    private double bandaLarga;
    private double tvAssinatura;
    private double desconto1;
    private double desconto2;
    private double desconto3;

    public ComboServico(double telefoniaMovel, double bandaLarga, double tvAssinatura,
                        double desconto1, double desconto2, double desconto3) {
        this.telefoniaMovel = telefoniaMovel;
        this.bandaLarga = bandaLarga;
        this.tvAssinatura = tvAssinatura;
        this.desconto1 = desconto1;
        this.desconto2 = desconto2;
        this.desconto3 = desconto3;
    }

    public double calcularTotal() {
        double valorTotal = telefoniaMovel + bandaLarga + tvAssinatura;
        int servicosContratados = 0;

        if (telefoniaMovel > 0) servicosContratados++;
        if (bandaLarga > 0) servicosContratados++;
        if (tvAssinatura > 0) servicosContratados++;

        double descontoAplicado = 0.0;

        // Aplicar o desconto baseado na quantidade de serviços contratados
        if (servicosContratados == 1) {
            descontoAplicado = desconto1;
        } else if (servicosContratados == 2) {
            descontoAplicado = desconto2;
        } else if (servicosContratados == 3) {
            descontoAplicado = desconto3;
        }

        // Calcula o valor com o desconto progressivo
        valorTotal = valorTotal - (valorTotal * (descontoAplicado / 100.0));

        // Se todos os três serviços foram contratados, aplicar o desconto adicional de R$ 20,00
        if (servicosContratados == 3) {
            valorTotal -= 20.00;
        }

        return valorTotal;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos valores dos serviços
        String[] valoresServicos = scanner.nextLine().split(",");
        double telefoniaMovel = Double.parseDouble(valoresServicos[0]);
        double bandaLarga = Double.parseDouble(valoresServicos[1]);
        double tvAssinatura = Double.parseDouble(valoresServicos[2]);

        // Entrada dos percentuais de desconto
        String[] valoresDesconto = scanner.nextLine().split(",");
        double desconto1 = Double.parseDouble(valoresDesconto[0]);
        double desconto2 = Double.parseDouble(valoresDesconto[1]);
        double desconto3 = Double.parseDouble(valoresDesconto[2]);

        // Criar o objeto ComboServico
        ComboServico combo = new ComboServico(telefoniaMovel, bandaLarga, tvAssinatura,
                desconto1, desconto2, desconto3);

        // Calcular e exibir o valor total com desconto
        double valorFinal = combo.calcularTotal();
        System.out.printf("%.2f%n", valorFinal);

        scanner.close();
    }
}
