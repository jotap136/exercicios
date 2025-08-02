
package exerciciosjava;

public class casting {
    public static void main (String[]args){
        System.out.println("teste");
        double resultados = 0;
        int resultadoint = (int) resultados;

        int meuInt = 10;
        double meuDouble = meuInt;


        String meuString = "10";
        int meuint2 = Integer.parseInt(meuString);

        String minhaString = String.valueOf(meuint2);
    }
}
