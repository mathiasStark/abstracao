package automoveis;

import util.Automovel;

public class Moto extends Automovel {
    @Override
    public void ligar() {
        System.out.println("Tranco no pedal.");
    }

    @Override
    public void acelerar() {
        System.out.println("Puxar a manopla do lado direito.");
    }

    @Override
    public void conduzir() {
        System.out.println("Conduzir guidão");
    }
}
