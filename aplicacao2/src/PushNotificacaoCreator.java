public class PushNotificacaoCreator extends NotificacaoCreator {
    @Override
    public Notificacao criarNotificacao() {
        return new PushNotificacao();
    }
}
