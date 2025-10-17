package desafio.desconto;

import desafio.cliente.Cliente;

public class CalculadoraDesconto {
    public double calcular(Cliente cliente, double valor) {
        Desconto desconto;
        if ("VIP".equals(cliente.getTipo())) {
            desconto = new DescontoVIP();
        } else {
            desconto = new DescontoRegular();
        }
        return desconto.aplicar(valor);
    }
}
