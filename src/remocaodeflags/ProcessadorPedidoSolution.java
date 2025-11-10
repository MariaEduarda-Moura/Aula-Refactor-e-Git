package remocaodeflags;

public class ProcessadorPedidoSolution {

    public void processarComDesconto(Pedido pedido){
        double valor = pedido.getValor() * 0.9;
        System.out.println("Desconto aplicado: " + valor);
        pedido.setValor(valor);
    }

    public void processarSemDesconto(Pedido pedido){
        System.out.println("Valor sem desconto: " + pedido.getValor());
        pedido.setValor(pedido.getValor());
    }
}
