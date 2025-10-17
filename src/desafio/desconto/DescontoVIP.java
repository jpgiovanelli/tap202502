package desafio.desconto;

public class DescontoVIP implements Desconto {
    @Override
    public double aplicar(double valor) {
        return valor * 0.8;
    }
}
