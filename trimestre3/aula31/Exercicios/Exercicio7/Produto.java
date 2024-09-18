package trimestre3.aula31.Exercicios.Exercicio7;

/**
 * Classe abstrata que representa um produto em um e-commerce.
 * Cada produto tem nome, preço e categoria.
 */
public abstract class Produto {
    protected String nome;
    protected double preco;
    protected String categoria;

    /**
     * Construtor para inicializar os atributos de um produto.
     *
     * @param nome O nome do produto.
     * @param preco O preço do produto.
     * @param categoria A categoria do produto.
     */
    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    /**
     * Método abstrato para calcular o preço final do produto.
     * Deve ser implementado pelas subclasses.
     *
     * @return O preço final do produto.
     */
    public abstract double calcularPrecoFinal();

    /**
     * Método abstrato para exibir os detalhes do produto.
     * Deve ser implementado pelas subclasses.
     */
    public abstract void exibirDetalhes();
}
