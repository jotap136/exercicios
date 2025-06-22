package exerciciosjava;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
     Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um valor numérico: ");
        int num = leitor.nextInt();

        for (int i = 0; i < 11; i++) {
            int resultado = num * i;
            System.out.printf("%d x %d = %d%n ", num, i, resultado);
        } 
    }  
   
}
