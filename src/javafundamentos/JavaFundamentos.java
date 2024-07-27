package javafundamentos;

import javafundamentos.oop.exercisios.Pagamento;
import javafundamentos.oop.exercisios.PagamentoCred;
import javafundamentos.oop.exercisios.PagamentoDeb;
import javafundamentos.oop.exercisios.PagamentoPix;
import javafundamentos.oop.exercisios.ProcessarPagamento;

public class JavaFundamentos {

    public static void main(String[] args) {
        int valor = 5000;
        String origem = "empresa A";
        int data = 20240727;
        String metodo = "credito";
        Pagamento pagamento = null;
        
        
        
        
        if (metodo.equalsIgnoreCase("credito")) {
            PagamentoCred credito = new PagamentoCred();
            credito.setData(data);
            credito.setJuros(3.14f);
            credito.setMetodo(metodo);
            credito.setOrigem(origem);
            credito.setValor(valor);
            credito.setVezes(3);
            
            pagamento = credito;

            System.out.println("pagamento montado");

        } else if (metodo.equalsIgnoreCase("debito")) {
            PagamentoDeb debito = new PagamentoDeb();
            
            

            debito.setData(data);
            debito.setJuros(1.7f);
            debito.setMetodo(metodo);
            debito.setOrigem(origem);
            debito.setValor(valor);
            
            pagamento = debito;
           

            System.out.println("pagamento montado");

        } else if (metodo.equalsIgnoreCase("pix")) {
            PagamentoPix pix = new PagamentoPix();
            pix.setChave("214-153-643.43");
            pix.setData(data);
            pix.setJuros(0.8f);
            pix.setMetodo(metodo);
            pix.setOrigem(origem);
            pix.setValor(valor);
            
            pagamento = pix;
            
            System.out.println("processo montado");

        }
        
        ProcessarPagamento processar = new ProcessarPagamento();
        processar.processar(pagamento);
        
        System.out.println("processando pagamento");
    }

    public void mostrarMensagem() {
        System.out.println("Mensagem");
    }

    public void mostrarMensagemBemVindo(String nome) {
        System.out.println("bem vindo " + nome);
    }

    public int somar(int a, int b) {
        return a + b;
    }

    public void loops() {

        for (int index = 0; index < 10; index += 1) {
            System.out.println("LOOP " + index);
        }

        int loopIndex = 10;
        while (loopIndex > 0) {
            System.out.println("while " + loopIndex);
            loopIndex -= 1;
        }

        String[] emails = new String[]{
            "felipe@gmail.com",
            "felipe@hotmail.com",
            "felipe@outlook.com",
            "felipe@yahoo.com"
        };

        for (int index = 0; index < emails.length; index += 1) {
            System.out.println("Na posição " + index + " o valor é " + emails[index]);
        }

        int[] idades = new int[6];
        idades[0] = 25;
        idades[1] = 13;
        idades[2] = 17;
        idades[3] = 99;
        idades[4] = 65;
        idades[5] = 54;

        for (int index = 0; index < idades.length; index += 1) {
            if (idades[index] < 18) {
                continue; // pula o processo no loop
            }

            System.out.println("Permitido a entrada " + idades[index]);
        }

        for (int index = 0; index < idades.length; index += 1) {
            idades[index] = idades[index] * 2;
        }

        for (int index = 0; index < idades.length; index += 1) {
            idades[index] = idades[index] - 15;
        }

        // criem um loop para adicionar +5 no valor se ele for menor que 50
        for (int index = 0; index < idades.length; index += 1) {
            if (idades[index] < 50) {
                idades[index] = idades[index] + 5;
            }
        }

        for (int index = 0; index < idades.length; index += 1) {
            if (idades[index] >= 50) {
                continue;
            }

            idades[index] = idades[index] + 5;
        }
    }

    public void condicional() {
        boolean verdadeiro = true;
        boolean falso = false;

        if (falso) {
            System.out.println("Sim, foi verdade 1x");
        } else {
            System.out.println("Não, foi mentira 1x");
        }

        int notaAprovacao = 7;
        int notaConselho = 5;
        int notaAluno = 6;

        if (notaAluno >= notaAprovacao) {
            System.out.println("Aluno aprovado");
        } else if (notaAluno >= notaConselho) {
            System.out.println("Aluno aprovado pelo conselho");
        } else {
            System.out.println("Aluno reprovado");
        }

        int orcamento = 1000;
        int valorDaCompra = 1800;
        // if/else se a compra foi aprovada
        if (orcamento >= valorDaCompra) {
            System.out.println("Compra aprovada");
        } else {
            System.out.println("Compra reprovada");
        }
    }

    public void conversao() {
        float numeroFlutuante = 10.5f;
        int numeroInteiro = 55;

        String numeroInteiroString = "77";
        String numeroFlutuanteString = "44.65";

        int flutuanteParaInteiro1 = (int) 10.55f;
        System.out.println(flutuanteParaInteiro1);

        int flutuanteParaInteiro2 = (int) Float.parseFloat(String.valueOf(10.55f));
        System.out.println(flutuanteParaInteiro2);

        int inteiroDaString = Integer.parseInt("55");
        System.out.println(inteiroDaString);

        String valorA = "55";
        String valorB = "77";

        String resultadoA = valorA + valorB;
        int resultadoB = Integer.parseInt(valorA) + Integer.parseInt(valorB);

        System.out.println(resultadoA);
        System.out.println(resultadoB);
    }

    public void tiposDeDados() {
        // numeros mais basicos
        int numeroInteiro = 100;
        float numerosFlutuantes = 100.55f;
        double numerosCom11casasDecimais = 100.12345678901;
        // textos basicos
        String texto = "Um texto com espaçõs e caracteres especiais";
        char caractereUnico = 'A';
        // operadores lógicos
        boolean verdadeiro = true;
        boolean falso = false;
        // array
        int[] numeros = new int[3];
        String[] emails = new String[6];
        String[] nomes = new String[]{
            "Felipe", "Carlos", "José"
        };

        System.out.println("[0] " + numeros[0]);
        System.out.println("[1] " + numeros[1]);
        System.out.println("[2] " + numeros[2]);

        int numeroIndex0 = numeros[0];
        System.out.println("index 0: " + numeroIndex0);
        numeros[0] = 15;
        numeros[1] = 5515;
        numeros[2] = 333;

        System.out.println("[0] " + numeros[0]);
        System.out.println("[1] " + numeros[1]);
        System.out.println("[2] " + numeros[2]);

        // somando dados
        int valorA = 10 + 10;
        System.out.println("valorA = " + valorA);
        int valorB = valorA + 10;
        System.out.println("valorB = " + valorB);
        int valorC = valorA + valorB;
        System.out.println("valorC = " + valorC);
        int valorD = 10;
        valorD = valorD + valorA;
        System.out.println("valorD = " + valorD);
        // subtrair dados
        int valorE = 10 - 10;
        System.out.println("ValorE = " + valorE);
        // multiplicar
        int valorF = 10 * 10;
        System.out.println("ValorF = " + valorF);
        // dividir
        int valorG = 10 / 10;
        System.out.println("valorG = " + valorG);

        int[][] posicoes = new int[3][3];

        int x = 2;
        int o = 1;

        posicoes[1][2] = x;
        posicoes[2][0] = o;
        posicoes[0][0] = x;

        for (int i = 0; i < posicoes.length; i += 1) {
            for (int j = 0; j < posicoes[i].length; j += 1) {
                System.out.println("i = " + i + " e j =" + j + ". " + posicoes[i][j]);
            }
        }

        String[][] emailsPermissoes = new String[3][2];
        emailsPermissoes[0][0] = "leitura";
        emailsPermissoes[0][1] = "gravacao";
        emailsPermissoes[1][0] = "x";
        emailsPermissoes[1][1] = "gravacao";
        emailsPermissoes[2][0] = "leitura";
        emailsPermissoes[2][1] = "x";

        for (int index = 0; index < emailsPermissoes.length; index++) {
            for (int index2 = 0; index2 < emailsPermissoes[index].length; index2++) {
                System.out.println(
                        "Permissoes[" + index + "][" + index2 + "] = "
                        + emailsPermissoes[index][index2]
                );
            }
        }
    }

    public void inicio() {
        int idade = 28;
        System.out.println("idade = " + idade);
        // sout

        String nome = "Felipe O Ribeiro";
        System.out.println(nome);

        String profissao = "Dev";
        System.out.println(profissao);

        // criem 3 variaveis
        // 2 numericas
        // 1 texto
        String apelido = "Sei la";
        String cor = "Azul";
        int quantidade = 1;

        System.out.println("apelido=" + apelido);
        System.out.println("cor=" + cor);
        System.out.println("quantidade=" + apelido);
    }

}
