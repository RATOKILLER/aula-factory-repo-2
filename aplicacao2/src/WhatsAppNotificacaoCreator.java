public class WhatsAppNotificacaoCreator extends NotificacaoCreator {
    @Override
    public Notificacao criarNotificacao() {
        return new WhatsAppNotificacao();
    }
}
