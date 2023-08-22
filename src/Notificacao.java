public class Notificacao implements Notifica{
    private String message;
    @Override
    public void Notificar(String message) {
        System.out.println(message);

    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
