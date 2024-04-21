package apps;

public abstract class ServicoMensagens {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    protected  void verificarConexao() {
        System.out.println("Verificando conexão com internet");
    };


}
