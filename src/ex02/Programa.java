package ex02;

public class Programa {
    public static void main(String[] args) {
        GeradorRelatorios geradorRelatorios = new GeradorRelatorios();
        SalvarRelatorios salvarRelatorios = new SalvarRelatorios();

        geradorRelatorios.gerar();
        salvarRelatorios.salvarEmArquivo();
    }
}
