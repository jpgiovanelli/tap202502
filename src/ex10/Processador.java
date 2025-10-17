package ex10;

class Processador {
    private final LeitorDeDados leitor;

    public Processador(LeitorDeDados leitor) {
        this.leitor = leitor;
    }

    public void processar() {
        System.out.println(leitor.ler());
    }
}
