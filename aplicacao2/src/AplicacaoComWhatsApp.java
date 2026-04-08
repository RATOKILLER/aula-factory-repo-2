public class AplicacaoComWhatsApp extends Aplicacao {

    @Override
    public void initialize(String canal) {
        if ("whatsapp".equalsIgnoreCase(canal)) {
            creator = new WhatsAppNotificacaoCreator();
        } else {
            super.initialize(canal);
        }
    }
}
