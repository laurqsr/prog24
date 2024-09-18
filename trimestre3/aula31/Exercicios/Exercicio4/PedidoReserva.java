package trimestre3.aula31.Exercicios.Exercicio4;

/**
 * Classe que representa um pedido de reserva em um restaurante.
 */
public class PedidoReserva extends Pedido {

    /**
     * Construtor para inicializar um pedido de reserva.
     *
     * @param numeroPedido O número do pedido.
     */
    public PedidoReserva(int numeroPedido) {
        super(numeroPedido);
    }

    /**
     * Implementação do método de calcular o total para um pedido de reserva.
     *
     * @return O valor total do pedido.
     */
    @Override
    public double calcularTotal() {
        return itens.size() * 15.0; // Cada item custa 15
    }
}
