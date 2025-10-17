package desafio;

import desafio.cliente.Cliente;
import desafio.desconto.CalculadoraDesconto;
import desafio.pagamento.CartaoCredito;
import desafio.pagamento.MetodoPagamento;
import desafio.pedido.Pedido;
import desafio.pedido.PedidoService;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", "joao@email.com", "VIP");
        Pedido pedido = new Pedido(cliente, 100.0);

        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
        PedidoService pedidoService = new PedidoService(calculadoraDesconto);

        MetodoPagamento metodoPagamento = new CartaoCredito();

        pedidoService.processarPedido(pedido, metodoPagamento);
    }
}
