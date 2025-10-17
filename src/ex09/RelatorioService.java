package ex09;

class RelatorioService {
    private final Repositorio repositorio;

    public RelatorioService(Repositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void gerarRelatorio() {
        repositorio.salvar("Relatório de vendas");
    }
}
