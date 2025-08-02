package exerciciosjava;


public class OOP {
    public static void main (String[]args){
        Carro meuCarro = new Carro(" Fusca");
        Carro meuCarro2 = new Carro(" Gol bolinha");
        Carro meuCarro3 = new Carro(" renaut");
        Carro meuCarro4 = new Carro(" Sandero");
        Carro meuCarro5 = new Carro(" Mercedez");
        
        meuCarro.acelerar();
        String result = meuCarro.teste();
        System.out.println(result);    
    }
}

class Carro{
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
