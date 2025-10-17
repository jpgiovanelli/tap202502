package ex04;

public class Main {
    public static void main(String[] args) {
        CalculadoraArea calc = new CalculadoraArea();
        Forma circulo = new Circulo(5);
        Forma retangulo = new Retangulo(4, 6);

        System.out.println("Área do círculo: " + calc.calcularArea(circulo));
        System.out.println("Área do retângulo: " + calc.calcularArea(retangulo));
    }
}
