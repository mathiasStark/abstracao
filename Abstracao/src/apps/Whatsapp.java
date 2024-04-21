package apps;

public class Whatsapp extends ServicoMensagens{
    @Override
    public void enviarMensagem() {
        verificarConexao();
        System.out.println("Enviando Mensagem pelo Whatsapp");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Whatsapp");
    }
}
