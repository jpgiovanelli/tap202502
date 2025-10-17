package ex01;

public class Program {
    public static void main(String[] args) {
        Usuario u = new Usuario();
        u.cadastrar("Ana", "ana@email.com");
        EmailSender emailSender = new EmailSender();
        emailSender.enviarEmailBoasVindas("ana@email.com");
    }
}
