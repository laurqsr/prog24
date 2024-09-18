package trimestre3.aula31.Exercicios.Exercicio8;

/**
 * Interface que define o método para conectar jogadores em jogos digitais.
 */
public interface Multiplayer {
    /**
     * Método para conectar múltiplos jogadores em um jogo digital.
     *
     * @param jogadores Array de strings representando os nomes dos jogadores.
     */
    void conectarJogadores(String[] jogadores);
}
