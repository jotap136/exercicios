package exerciciosjava;

public class Carro {
    String modelo;
    public Carro(String Modelo){
        this.modelo = Modelo;
    }

    public void acelerar(){
        System.out.println("Acelerando carro" + this.modelo);
    }

    public String teste(){
        return "oi";
    }


}
