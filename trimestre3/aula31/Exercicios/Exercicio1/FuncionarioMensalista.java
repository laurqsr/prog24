package trimestre3.aula31.Exercicios.Exercicio1;

/**
 * Classe que representa um funcionário mensalista.
 * O salário é calculado com base em um salário fixo mensal.
 */
public class FuncionarioMensalista extends Funcionario implements Pagamento {

    /**
     * Construtor para inicializar o nome e o salário base do funcionário mensalista.
     *
     * @param nome        O nome do funcionário.
     * @param salarioBase O salário base do funcionário.
     */
    public FuncionarioMensalista(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário do funcionário mensalista.
     *
     * @return O salário mensal do funcionário.
     */
    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    /**
     * Processa o pagamento para o funcionário mensalista.
     */
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento processado para mensalista: " + nome + ". Salário: " + calcularSalario());
    }
}
