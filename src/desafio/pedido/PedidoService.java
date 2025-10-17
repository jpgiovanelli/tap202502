package desafio.pedido;

import desafio.desconto.CalculadoraDesconto;
import desafio.pagamento.MetodoPagamento;

public class PedidoService {
    private final CalculadoraDesconto calculadoraDesconto;

    public PedidoService(CalculadoraDesconto calculadoraDesconto) {
        this.calculadoraDesconto = calculadoraDesconto;
    }

    public void processarPedido(Pedido pedido, MetodoPagamento metodoPagamento) {
        double valorComDesconto = calculadoraDesconto.calcular(pedido.getCliente(), pedido.getValor());
        metodoPagamento.pagar(valorComDesconto);
    }
}
