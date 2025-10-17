package ex10;

public class Main {
    public static void main(String[] args) {
        LeitorDeDados leitor = new LeitorArquivo();
        Processador p = new Processador(leitor);
        p.processar();
    }
}
