package javafundamentos.oop.exercisios;

public class PagamentoPix extends Pagamento {

    private float juros;
    private String chavepix;

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

    /**
     * @return the chavepix
     */
    public String getChave() {
        return chavepix;
    }

    /**
     * @param chavepix the chavepix to set
     */
    public void setChave(String chavepix) {
        this.chavepix = chavepix;
    }

}
