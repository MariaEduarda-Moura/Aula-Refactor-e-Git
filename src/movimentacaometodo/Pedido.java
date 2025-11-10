package movimentacaometodo;

public class Pedido {
    private double valorTotal;

    public Pedido(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double calcularDesconto() {
        if (this.valorTotal > 1000) {
            return this.valorTotal * 0.10;
        } else if (this.valorTotal > 500) {
            return this.valorTotal * 0.05;
        }
        return 0;
    }
}

