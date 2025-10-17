package desafio.cliente;

public class Cliente {
    private String nome;
    private String email;
    private String tipo;

    public Cliente(String nome, String email, String tipo) {
        this.nome = nome;
        this.email = email;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTipo() {
        return tipo;
    }
}
