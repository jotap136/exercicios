package exerciciosjava;
// igual a interface, mas aqui eu posso implementar
public abstract class serVivo {


    protected int idade;


    public int Servivo(int idade){
        this.idade = idade;
        return idade;
    }
    public abstract  void respirar();

    public void dormir(){
        System.out.println("Dormindo");
    }

    
}
