// Nome: Arthur Gabriel Santana dos Santos 
// Matrícula: 1261940088

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }

        input.close();
    }
}
