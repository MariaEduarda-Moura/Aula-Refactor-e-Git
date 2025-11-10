package extracaometodo;

/**
 * EXERCÍCIO: Extração de Método
 * 
 * PROBLEMA: O método calcularTotal() está fazendo muitas coisas e tem código duplicado.
 * 
 * TAREFA: Extraia os cálculos de desconto e imposto em métodos separados.
 * 
 * DICA: Identifique blocos de código que fazem uma coisa específica e extraia-os em métodos nomeados.
 */
public class Calculadora {

    public double calcularTotal(double preco, int quantidade, boolean temDesconto, boolean temImposto) {
        double subtotal = preco * quantidade;

        if (temDesconto) {
            subtotal = aplicarDesconto(subtotal, quantidade);
        }
        if (temImposto) {
            subtotal = aplicarImposto(subtotal);
        }

        return subtotal;
    }

    private double aplicarDesconto(double subtotal, int quantidade) {
        if (quantidade > 10) {
            return subtotal - (subtotal * 0.15);
        } else if (quantidade > 5) {
            return subtotal - (subtotal * 0.10);
        } else {
            return subtotal - (subtotal * 0.05);
        }
    }

    private double aplicarImposto(double subtotal) {
        if (subtotal > 1000) {
            return subtotal + (subtotal * 0.20);
        } else if (subtotal > 500) {
            return subtotal + (subtotal * 0.15);
        } else {
            return subtotal + (subtotal * 0.10);
        }
    }
}

