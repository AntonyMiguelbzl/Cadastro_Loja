package Tipos;

public class Camiseta {

    private static String cor;
    private String tamanho;
    private static double preco;


    public Camiseta(String cor, String tamanho, double preco) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public static String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public static double getPreco() {
        return preco;
    }

    public double calcularDesconto() {
        return this.preco - (this.preco * 0.10);
    }

}
