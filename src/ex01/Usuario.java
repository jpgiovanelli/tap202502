package ex01;

public class Usuario {

    public void cadastrar(String nome, String email) {
        System.out.println("Usuário cadastrado: " + nome);
    }

    public boolean validarSenha(String senha) {
        return senha.length() >= 8;
    }
}