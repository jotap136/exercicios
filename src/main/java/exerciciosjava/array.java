package exerciciosjava;
import java.util.ArrayList;

public class array {
 public static void main(String[] args) {
	    /**String[] nome = new String [3];
	    nome[0] = "Teste";
	    nome[1] = "João";
	    nome[2] = "Locaweb";
		for (int i = 0; i < nome.size(); i++){
	    //System.out.println(nome[0]);
 		}
		**/
		
	    ArrayList<String> nome = new ArrayList<>();
		nome.add("Paulo");
		nome.add("Pedro");
		nome.add("Pateta");
		nome.add("aaaaaaaaaaa");
		nome.remove(0);
	    /**for (int i = 0; i < nome.size(); i ++){
			System.out.println(nome.get(i));
		}
**/
		//funciona para array normal e arraylist
		for(String lista : nome){
			System.out.println(nome);
		}
	}
   
}
