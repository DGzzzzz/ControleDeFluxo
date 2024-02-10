package br.com.dg;
//importando classe Scanner
import java.util.Scanner;

public class CalculaMedia {
    public static void main(String args[]) {
        //Criando objeto Scanner para coletar entrada do usuário
        Scanner s = new Scanner(System.in);

        //Solicitando entrada do usuário
        System.out.println("Digite a primeira nota: ");
        double nota1 = s.nextInt();
        System.out.println("Digite a segunda nota: ");
        double nota2 = s.nextInt();
        System.out.println("Digite a terceira nota: ");
        double nota3 = s.nextInt();
        System.out.println("Digite a quarta nota: ");
        double nota4 = s.nextInt();

        double media = calcularMedia(nota1, nota2, nota3, nota4);

        System.out.println("A média das notas é: " + media);
        s.close();

        // verificando se o aluno foi aprovado, reprovado ou ficará em recuperação
        if(media >= 7) {
            System.out.println("Aprovado");
        } else if (media <= 7 && media >= 5) {
            System.out.print("Recuperação");
        } else {
            System.out.print("Reprovado");
        }
    }

    // Método para calcular a média
    public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4.0;
    }
}
