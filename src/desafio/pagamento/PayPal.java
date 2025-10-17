package desafio.pagamento;

public class PayPal implements MetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando " + valor + " com PayPal.");
    }
}
