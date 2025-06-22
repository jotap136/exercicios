/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exerciciosjava;

/**
 *
 * @author João Paulo
 */
import java.util.Scanner;
public class Exercicios {

     public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe um valor númerico inteiro: ");
        int num = leitor.nextInt();

        System.out.println("informe o segundo valor númerico inteiro: ");
        int num2 = leitor.nextInt();
        leitor.nextLine();

        System.out.println("Qual conta você deseja fazer?: ");
        String operacao = leitor.nextLine();

        double resultado = 0;
        switch(operacao){
            case "subtracao":
            resultado = num - num2;
            break;

            case "divisao":
            resultado = num - num2;
            break;

            case "adicao":
            resultado = num + num2;
            break;

            case "vezes":
            resultado = num * num2;
            break;
        }
        System.out.println("O resultado final foi " + resultado);
        
        
    }
    
}
