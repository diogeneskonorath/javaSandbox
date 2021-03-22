package com.diogeneskonorath.exerciciocleancode.exercicio1;

import java.util.Iterator;
import java.util.List;

public class GeradorObservacao {
    static final String textoSingular = "Fatura da nota fiscal de simples remessa: ";
    static final String textoPlural = "Fatura das notas fiscais de simples remessa: ";
    String textoFatura="Não há itens na lista!";

    public String geraObservacao(List<Integer> listaCodigos){
        if (listaCodigos.isEmpty())
        {
            return textoFatura;
        }
        return retornaCodigos(listaCodigos) + ".";
    }

    private String retornaCodigos(List<Integer> listaNotasFiscais){
        if (listaNotasFiscais.size() >= 2) {
            textoFatura = textoPlural;
        } else {
            textoFatura = textoSingular;
        }

        StringBuilder observacao = new StringBuilder();
        double total=0.0;

        for (Iterator<Integer> iterator = listaNotasFiscais.iterator(); iterator.hasNext();) {
            Integer codigo = iterator.next();
            Double valor = consultavalor(codigo);

            String separador = "";
            if( observacao.toString() == null || observacao.toString().length() <= 0 )
                separador =  "";
            else if( iterator.hasNext() )
                separador =  ", ";
            else
                separador =  " e ";

            total+=valor;
            observacao.append(separador + codigo + " cujo o valor é R$" +valor);

        }

        return textoFatura + observacao + ", Total: " + total;
    }

    private Double consultavalor(Integer codigo){
        double valor=0.0;
        switch (codigo){
            case 1:
                valor = 10.00;
                return valor;
            case 2:
                valor = 35.00;
                return valor;
            case 3:
                valor = 5.00;
                return valor;
            case 4:
                valor = 1500.00;
                return valor;
            case 5:
                valor = 0.30;
                return valor;
            default:
                return valor;
        }
    }
}
