package Tipos;

public class CamisetaEstampada extends Camiseta {

    public CamisetaEstampada(String cor, String tamanho, double preco) {
        super(cor,tamanho,preco);
    }

    @Override
    public double calcularDesconto() {
        return getPreco() - (getPreco() * 0.05);
    }
}
