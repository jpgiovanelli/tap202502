package ex05;

class Pato extends Ave implements AveQueVoa {
    @Override
    public void voar() {
        System.out.println("Pato voando...");
    }
}
