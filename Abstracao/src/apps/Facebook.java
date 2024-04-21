package apps;

public class Facebook extends ServicoMensagens{
    @Override
    public void enviarMensagem() {
        verificarConexao();
        System.out.println("Enviando mensaagem pelo Facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo Face");
    }
}
