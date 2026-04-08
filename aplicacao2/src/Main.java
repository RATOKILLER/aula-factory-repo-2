public class Main {
    public static void main(String[] args) {
        // Usa a subclasse, que entende todos os canais antigos + WhatsApp.
        Aplicacao app = new AplicacaoComWhatsApp();

        app.initialize("email");
        app.enviar("Bem-vindo ao nosso sistema!");

        app.initialize("sms");
        app.enviar("Seu codigo de verificacao e 1234.");

        app.initialize("push");
        app.enviar("Voce tem uma nova mensagem no app.");

        // Novo canal - adicionado SEM modificar nenhuma classe existente.
        app.initialize("whatsapp");
        app.enviar("Sua entrega chegou!");
    }
}
