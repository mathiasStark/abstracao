import automoveis.Carro;
import automoveis.Moto;
import util.Automovel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Automoveis {
    public static void main(String[] args) {
        Automovel carro = new Carro();
        carro.ligar();
        carro.acelerar();
        carro.conduzir();

        Automovel moto = new Moto();
        moto.ligar();
        moto.acelerar();
        moto.conduzir();

        List<Automovel> autos = Arrays.asList(moto, carro);
        for (Automovel a: autos) {
            System.out.println("Ligar");
            a.ligar();
        }

    }
}
