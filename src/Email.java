public class Email extends Notificacao {

    public Email(String message){
        this.setMessage(message);
    }
    public String Enviar(String email){
        this.Notificar(getMessage());
        return ("Enviada para o email: "+email);
    }

}
