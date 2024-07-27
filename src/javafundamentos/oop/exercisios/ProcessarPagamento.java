package javafundamentos.oop.exercisios;

public class ProcessarPagamento {

    public void processar(Pagamento pagamento) {

        if (pagamento instanceof PagamentoCred) {
        } else if (pagamento instanceof PagamentoPix) {

        } else if (pagamento instanceof PagamentoDeb) {

        }

    }

    private void processarCredito(PagamentoCred pagamento) {

    }

    private void processardebito(PagamentoDeb pagamento) {

    }

    private void processarpix(PagamentoPix pagamento) {

    }

}
