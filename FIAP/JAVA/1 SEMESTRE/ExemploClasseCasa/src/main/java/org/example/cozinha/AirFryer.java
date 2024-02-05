package org.example.cozinha;

public class AirFryer extends Eletrodomestico{
    @Override
    public void Ligar()
    {
        super.Ligar();
        System.out.println("Temperatura subindo");
    }
}
