package org.example.cozinha;

public class Fogao extends Eletrodomestico {
    int numeroDeBocas;
    boolean temFornoEmbutido;
    String tipo;
    int Potencia;

    @Override
   public void Ligar()
   {
       super.Ligar();
       Aquecer();
   }

   private void Aquecer()
   {
       System.out.println("Temperatura subindo");
   }
}
