public class Aplicacao {

    protected NotificacaoCreator creator;

    // Decide qual tipo criar
    public void initialize(String canal) {
        if ("email".equalsIgnoreCase(canal)) {
            creator = new EmailNotificacaoCreator();
        } else if ("sms".equalsIgnoreCase(canal)) {
            creator = new SmsNotificacaoCreator();
        } else if ("push".equalsIgnoreCase(canal)) {
            creator = new PushNotificacaoCreator();
        } else {
            throw new IllegalArgumentException("Canal nao suportado: " + canal);
        }
    }

    public void enviar(String mensagem) {
        creator.enviarNotificacao(mensagem);
    }
}
