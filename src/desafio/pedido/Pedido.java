package desafio.pedido;

import desafio.cliente.Cliente;

public class Pedido {
    private Cliente cliente;
    private double valor;

    public Pedido(Cliente cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }
}
