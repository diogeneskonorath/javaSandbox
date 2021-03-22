package com.diogeneskonorath.exerciciocleancode.exercicio1;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> teste = new ArrayList();
        GeradorLegado geradorTeste = new GeradorLegado();
        GeradorObservacao geradorObservacao = new GeradorObservacao();
        teste.add(1);
        teste.add(2);
        teste.add(3);
        teste.add(4);
        teste.add(5);

        System.out.println("Legado:");
        System.out.println(geradorTeste.geraObservacao(teste));
        System.out.println("Nova feature:");
        System.out.println(geradorObservacao.geraObservacao(teste));
    }
}
