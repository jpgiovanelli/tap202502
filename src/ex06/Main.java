package ex06;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.mover();
        carro.acelerar();

        Bicicleta bicicleta = new Bicicleta();
        bicicleta.mover();
        bicicleta.pedalar();
    }
}
