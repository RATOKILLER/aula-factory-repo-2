public class PushNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[PUSH] Enviando notificacao para o app mobile: " + mensagem);
    }
}
