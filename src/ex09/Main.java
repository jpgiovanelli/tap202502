package ex09;

public class Main {
    public static void main(String[] args) {
        Repositorio repositorio = new BancoDeDados();
        RelatorioService service = new RelatorioService(repositorio);
        service.gerarRelatorio();
    }
}
