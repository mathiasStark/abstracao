package eletrodomesticos;

import util.Eletrodomestico;

public class Fogao extends Eletrodomestico {
    @Override
    public void ligar() {
        System.out.println("Acender fogo");
    }

    @Override
    public void delisgar() {
        System.out.println("Desligar Fogo");
    }

    @Override
    public void funcionalidade() {
        System.out.println("Cozinhar");
    }
}
