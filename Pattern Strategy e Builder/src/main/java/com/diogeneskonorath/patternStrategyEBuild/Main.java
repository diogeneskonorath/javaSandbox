package com.diogeneskonorath.patternStrategyEBuild;

public class Main {
    public static void main(String[] args) {
        SistemaMensagem sistemaMensagem = new SistemaMensagem();
        Cliente diogenes = new Cliente("diogenes", "diogenesks@gmail.com", "84125673");

        System.out.println(sistemaMensagem.notificacao(diogenes));
    }
}
