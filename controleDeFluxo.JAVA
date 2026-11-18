import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        //criar oscanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Cálculo de Média ===");
        
        //ler as notas
        System.out.print("Digite a nota do 1° bimestre: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota do 2° bimestre: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota do 3º bimestre: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a nota do 4° bimestre: ");
        double nota4 = scanner.nextDouble();

        //calcular média
        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;

        //duas casas
        System.out.printf("\nMédia final: %.2f\n", media);

        // verificar a situação do aluno
        if (media >= 7.0) {
            System.out.println("Situação: **Aprovado**! Parabéns!");
        } else if (media >= 5.0) {
            System.out.println("Situação: Em **Recuperação**. Estude mais um pouco!");
        } else {
            System.out.println("Situação: **Reprovado**.");
        }

        //fechar o scanner
        scanner.close();
    }
}