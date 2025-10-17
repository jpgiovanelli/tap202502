package ex03;

public class CalculadoraDesconto {
    public double calcular(Desconto desconto, double valor) {
        return desconto.aplicar(valor);
    }
}

