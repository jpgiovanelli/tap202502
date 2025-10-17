package desafio.pagamento;

public class CartaoCredito implements MetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando " + valor + " com cartão de crédito.");
    }
}
