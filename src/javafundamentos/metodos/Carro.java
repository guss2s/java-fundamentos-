package javafundamentos.metodos;

public class Carro {

    private String cor;
    private int quantidadePortas;
    private int quantidadeJanelas;
    private int quantidadeMarcha;
    private String nome;

    public void mostrarInformacoes() {
        String info = "----------\n"
                + "nome = " + getNome() + "\n"
                + "cor = " + getCor() + "\n"
                + "quantidade de janelas = " + getQuantidadeJanelas() + "\n"
                + "quantidade de marcha = " + getQuantidadeMarcha() + "\n"
                + "quantidade de portas = " + getQuantidadePortas() + "\n"
                + "----------";
        System.out.println(info);
    }

    public void abrirPorta(int numeroPorta) {
        if (numeroPorta < 1 || numeroPorta > quantidadePortas) {
            System.out.println("Porta inexistente");
        } else {
            System.out.println("Porta aberta");
        }
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the quantidadePortas
     */
    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    /**
     * @param quantidadePortas the quantidadePortas to set
     */
    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    /**
     * @return the quantidadeJanelas
     */
    public int getQuantidadeJanelas() {
        return quantidadeJanelas;
    }

    /**
     * @param quantidadeJanelas the quantidadeJanelas to set
     */
    public void setQuantidadeJanelas(int quantidadeJanelas) {
        this.quantidadeJanelas = quantidadeJanelas;
    }

    /**
     * @return the quantidadeMarcha
     */
    public int getQuantidadeMarcha() {
        return quantidadeMarcha;
    }

    /**
     * @param quantidadeMarcha the quantidadeMarcha to set
     */
    public void setQuantidadeMarcha(int quantidadeMarcha) {
        this.quantidadeMarcha = quantidadeMarcha;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

}
