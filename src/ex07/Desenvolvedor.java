package ex07;

class Desenvolvedor implements Trabalhador, Programador {
    public void trabalhar() {
        System.out.println("Trabalhando...");
    }

    public void programar() {
        System.out.println("Programando...");
    }
}
