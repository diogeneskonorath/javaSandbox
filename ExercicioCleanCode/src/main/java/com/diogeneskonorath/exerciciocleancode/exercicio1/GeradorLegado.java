package com.diogeneskonorath.exerciciocleancode.exercicio1;

import java.util.Iterator;
import java.util.List;

public class GeradorLegado {
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

        for (Iterator<Integer> iterator = listaNotasFiscais.iterator(); iterator.hasNext();) {
            Integer codigo = iterator.next();
            String separador = "";
            if( observacao.toString() == null || observacao.toString().length() <= 0 )
                separador =  "";
            else if( iterator.hasNext() )
                separador =  ", ";
            else
                separador =  " e ";

            observacao.append(separador + codigo);
        }

        return textoFatura + observacao;
    }
}
