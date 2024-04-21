package automoveis;

import util.Automovel;

public class Carro extends Automovel {

    @Override
    public void ligar() {
        System.out.println("Verificar ponto morto, girar chave.");
    }

    @Override
    public void acelerar() {
        System.out.println("Pisar no acelerador.");
    }

    @Override
    public void conduzir() {
        System.out.println("Virar volante");
    }
}
