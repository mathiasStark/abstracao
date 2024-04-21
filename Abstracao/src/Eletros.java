import eletrodomesticos.Fogao;
import eletrodomesticos.Geladeira;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Eletros {
    public static void main(String[] args) {

        Fogao fogao = new Fogao();
        fogao.ligar();
        fogao.funcionalidade();
        Geladeira geladeira = new Geladeira();
        geladeira.ligar();
        geladeira.funcionalidade();

    }
}