package trimestre3.aula31.Exercicios.Exercicio2;

/**
 * Classe que representa um jornal, que é uma publicação da biblioteca.
 * Os jornais podem ser emprestados, devolvidos e reservados.
 */
public class Jornal extends Publicacao implements Reservavel {

    /**
     * Construtor para inicializar um jornal com título, autor e ano de publicação.
     *
     * @param titulo        O título do jornal.
     * @param autor         O autor do jornal.
     * @param anoPublicacao O ano de publicação do jornal.
     */
    public Jornal(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    /**
     * Implementação do método de emprestar para um jornal.
     */
    @Override
    public void emprestar() {
        System.out.println("Jornal '" + titulo + "' emprestado.");
    }

    /**
     * Implementação do método de devolver para um jornal.
     */
    @Override
    public void devolver() {
        System.out.println("Jornal '" + titulo + "' devolvido.");
    }

    /**
     * Implementação do método de reservar para um jornal.
     */
    @Override
    public void reservar() {
        System.out.println("Jornal '" + titulo + "' reservado.");
    }
}
