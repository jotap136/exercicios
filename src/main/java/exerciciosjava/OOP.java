package exerciciosjava;


public class OOP {
    public static void main (String[]args){
        Carro meuCarro = new Carro(" Fusca");
        Carro meuCarro2 = new Carro(" Gol bolinha");
        Carro meuCarro3 = new Carro(" renaut");
        Carro meuCarro4 = new Carro(" Sandero");
        Carro meuCarro5 = new Carro(" Mercedez");
        
        meuCarro.acelerar();

        // sem herença/poliformismo, só da pra instanciar com o override
       /**  serVivo meuSer = new serVivo(){
            @Override
            public  void respirar(){

            }
        }
            **/

        serVivo meuSer = new Humano();
        System.out.println(meuSer);
    }
}


