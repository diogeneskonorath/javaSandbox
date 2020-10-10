package com.diogeneskonorath.coreEngeneering.tema11;

public class SucoFactory {

    public static Suco maquinaDeSuco(Frutas fruta){
        if (Frutas.LARANJA.equals(fruta)){
            return new SucoDeLaranja();
        }else if (Frutas.UVA.equals(fruta)) {
            return new SucoDeUva();
        }
        throw new SucoException("Fruta invalida");
    }
}
