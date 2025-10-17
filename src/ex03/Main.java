package ex03;

public class Main {
    public static void main(String[] args) {
        CalculadoraDesconto calc = new CalculadoraDesconto();

        System.out.println("Desconto VIP: " + calc.calcular(new DescontoVIP(), 100.0));
        System.out.println("Desconto Regular: " + calc.calcular(new DescontoRegular(), 100.0));
    }
}