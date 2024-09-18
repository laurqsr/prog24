package trimestre3.aula31.Exercicios.Exercicio4;

/**
 * Interface que define o método para aplicar desconto em um pedido.
 */
public interface Desconto {
    /**
     * Aplica um desconto no total do pedido.
     *
     * @param total O valor total original do pedido.
     * @return O valor total após o desconto.
     */
    double aplicarDesconto(double total);
}
