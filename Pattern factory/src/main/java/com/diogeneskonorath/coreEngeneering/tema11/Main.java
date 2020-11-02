package com.diogeneskonorath.coreEngeneering.tema11;

public class Main {
    public static void main(String[] args) {
        Suco suco = SucoFactory.maquinaDeSuco(Frutas.LARANJA);
        System.out.println(suco.getFruta());
    }
}
