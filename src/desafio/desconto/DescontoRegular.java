package desafio.desconto;

public class DescontoRegular implements Desconto {
    @Override
    public double aplicar(double valor) {
        return valor * 0.9;
    }
}
