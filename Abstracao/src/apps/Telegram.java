package apps;

public class Telegram extends ServicoMensagens{
    @Override
    public void enviarMensagem() {
        verificarConexao();
        System.out.println("Enviando Mensagem pelo Telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo Telegram");
    }
}
