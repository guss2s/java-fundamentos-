package javafundamentos.oop.exercisios;

public class PagamentoCred extends Pagamento {

    private int vezes;
    private float juros;

    /**
     * @return the vezes
     */
    public int getVezes() {
        return vezes;
    }

    /**
     * @param vezes the vezes to set
     */
    public void setVezes(int vezes) {
        this.vezes = vezes;
    }

    /**
     * @return the juros
     */
    public float getJuros() {
        return juros;
    }

    /**
     * @param juros the juros to set
     */
    public void setJuros(float juros) {
        this.juros = juros;
    }

}
