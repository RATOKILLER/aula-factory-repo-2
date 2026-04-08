public abstract class NotificacaoCreator {

    public abstract Notificacao criarNotificacao();

    public void enviarNotificacao(String mensagem) {
        Notificacao notificacao = criarNotificacao();
        notificacao.enviar(mensagem);
    }
}
