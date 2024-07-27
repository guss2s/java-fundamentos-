package javafundamentos.oop;

public class Funcionario extends Usuario {

    public Funcionario(String nome, int idade) {
        super(nome, idade);
    }

    private String funcao;
    private float valorHora;
    private float horasTrabalhadas;
    protected int nivel = 0;

    /**
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    /**
     * @return the valorHora
     */
    public float getValorHora() {
        return valorHora;
    }

    /**
     * @param valorHora the valorHora to set
     */
    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    /**
     * @return the horasTrabalhadas
     */
    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    /**
     * @param horasTrabalhadas the horasTrabalhadas to set
     */
    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }
}
