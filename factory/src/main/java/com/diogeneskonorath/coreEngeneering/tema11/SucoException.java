package com.diogeneskonorath.coreEngeneering.tema11;

public class SucoException extends IllegalArgumentException{
    public SucoException(String erro){
        super("Fruta invalida");
    }
}
