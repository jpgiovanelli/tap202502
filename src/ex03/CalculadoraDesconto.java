package ex03;

public class CalculadoraDesconto {
    public double calcular(Desconto desconto, double valor) {
        return desconto.aplicar(valor);
    }
}

class CalculadoraDescontoOld {

    public double calcular(String tipoCliente, double valor) {
        if (tipoCliente.equals("VIP")) {
            return valor * 0.8;
        } else if (tipoCliente.equals("REGULAR")) {
            return valor * 0.9;
        } else {
            return valor;
        }
    }

    public static void main(String[] args) {
        CalculadoraDesconto calc = new CalculadoraDesconto();
        System.out.println("Desconto VIP: " + calc.calcular("VIP", 100));
        System.out.println("Desconto Regular: " + calc.calcular("REGULAR", 100));
    }
}

