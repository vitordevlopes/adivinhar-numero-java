import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        // Criação do objeto scanner da classe Scanner para receber entradas
        Scanner scanner = new Scanner(System.in);

        // Criação do objeto random da classe Random para gerar numeros aleatorios
        Random random = new Random();

        int numeroAleatorio = random.nextInt(101);
        System.out.println(numeroAleatorio);

        System.out.println("Jogo da Adivinhação");
        System.out.println("Você terá 5 tentativas para descobrir o número!");
        System.out.println("Dica: O númwro está entre 0 e 100");

      int tentativaUsuario = 101;

       for (int i = 1; i <= 5; i++) {

           if (tentativaUsuario != numeroAleatorio) {

               System.out.print("Tentativa " + i + ": ");
               tentativaUsuario = scanner.nextInt();

               if (tentativaUsuario == numeroAleatorio) {

                   System.out.println("Você acertou o número!");

               } else {

                   if (tentativaUsuario > numeroAleatorio) {

                       System.out.println("Errado! O número secreto é menor do que " + tentativaUsuario);

                   } else {

                       System.out.println("Errado! O número secreto é maior do que " + tentativaUsuario);

                   }

               }

               if (i == 5 && tentativaUsuario != numeroAleatorio) {

                   System.out.println("");
                   System.out.println("Você perdeu! Suas tentativas acabaram. O número secreto era " + numeroAleatorio);

               }

           }


       }

    }
}

//Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.