package trimestre3.aula31.Exercicios.Exercicio3;

/**
 * Classe que representa um carro, que é um tipo de transporte.
 * Os carros podem ser movidos, parados e abastecidos.
 */
public class Carro extends Transporte implements Combustivel {

    /**
     * Construtor para inicializar um carro com capacidade e velocidade máxima.
     *
     * @param capacidade        A capacidade do carro.
     * @param velocidadeMaxima  A velocidade máxima do carro.
     */
    public Carro(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    /**
     * Implementação do método de mover para um carro.
     */
    @Override
    public void mover() {
        System.out.println("O carro está se movendo a " + velocidadeMaxima + " km/h.");
    }

    /**
     * Implementação do método de parar para um carro.
     */
    @Override
    public void parar() {
        System.out.println("O carro parou.");
    }

    /**
     * Implementação do método de abastecer para um carro.
     */
    @Override
    public void abastecer() {
        System.out.println("O carro está sendo abastecido.");
    }
}
