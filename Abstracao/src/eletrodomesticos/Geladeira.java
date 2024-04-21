package eletrodomesticos;

import util.Eletrodomestico;

public class Geladeira extends Eletrodomestico {

    @Override
    public void ligar() {
        System.out.println("Colocar na tomada");
    }

    @Override
    public void delisgar() {
        System.out.println("Tirar da tomada");
    }

    @Override
    public void funcionalidade() {
        System.out.println("Gelar alimentos");
    }
}
