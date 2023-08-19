/**
 * Recebe quatro notas <= 10 ,informadas pelo usuario,e resolce a media
 *
 * @author Bruno Lins
 * @version 1.0
 * @since 19.08.2023
 */
import java.util.Scanner;

public class Fluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double primeiraNota, segundaNota, terceiraNota, quartaNota;

        //Instruções
        System.out.println("**** INSTRUÇÕES ****");
        System.out.println("1- As notas não podem ser maiores que 10.");
        System.out.println("2- Se a nota for decimal, utilizar a virgula(,). Não utilize ponto(.).");
        System.out.println("3- Em caso de duvida, erro , ou 'BUG' no programa, contactar o suporte técnico.");
        System.out.println("********************");


        // Inserção da primeira nota
        do {
            System.out.print("Insira a primeira nota: ");
            primeiraNota = scanner.nextDouble();

            if (primeiraNota > 10) {
                System.out.println("A primeira nota não pode ser maior que 10.");
            }
        } while (primeiraNota > 10);
        //Se a condição do "do  while" for verdadeira, ela repete!

        // Inserção da segunda nota
        do {
            System.out.print("Insira a segunda nota: ");
            segundaNota = scanner.nextDouble();

            if (segundaNota > 10) {
                System.out.println("A segunda nota não pode ser maior que 10.");
            }
        } while (segundaNota > 10);
        //Se a condição do "do  while" for verdadeira, ela repete!

        // Inserção da terceira nota
        do {
            System.out.print("Insira a terceira nota: ");
            terceiraNota = scanner.nextDouble();

            if (terceiraNota > 10) {
                System.out.println("A terceira nota não pode ser maior que 10.");
            }
        } while (terceiraNota > 10);
        //Se a condição do "do  while" for verdadeira, ela repete!

        // Inserção da quarta nota
        do {
            System.out.print("Insira a quarta nota: ");
            quartaNota = scanner.nextDouble();

            if (quartaNota > 10) {
                System.out.println("A quarta nota não pode ser maior que 10.");
            }
        } while (quartaNota > 10);
        //Se a condição do "do  while" for verdadeira, ela repete!

        // Cálculo da média
        double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        // Verificação e exibição do resultado
        if (media >= 7) {
            System.out.println("Suas notas foram: N1: " + primeiraNota + " ,N2: " + segundaNota + " ,N3: " + terceiraNota + " ,N4: " + quartaNota + ". A média é: " + media + " situação : Aprovado");
        } else if (media >= 5 && media < 7) {
            System.out.println("Suas notas foram: N1: " + primeiraNota + " ,N2: " + segundaNota + " ,N3: " + terceiraNota + " ,N4: " + quartaNota + ". A média é: " + media + " situação : Recuperação");
        } else {
            System.out.println("Suas notas foram: N1: " + primeiraNota + " ,N2: " + segundaNota + " ,N3: " + terceiraNota + " ,N4: " + quartaNota + ". A média é: " + media + "situação : Reprovado");
        }

        scanner.close();
    }
}
