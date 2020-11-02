package com.diogeneskonorath.patternStrategyEBuild;

import org.junit.Test;

import static org.junit.Assert.*;

public class SistemaMensagemTest {
    @Test
    public void emailTest(){
        String teste;
        Cliente diogenes = new Cliente("diogenes", "diogenesks@gmail.com");
        SistemaMensagem sistemaMensagem = new SistemaMensagem();
        teste = sistemaMensagem.notificacao(diogenes);
        assertEquals("[EMAIL]HELLO diogenes", teste);
    }

    @Test
    public void smsTest(){
        String teste;
        Cliente diogenes = new Cliente("diogenes", "diogenesks@gmail.com", "84125673");
        SistemaMensagem sistemaMensagem = new SistemaMensagem();
        teste = sistemaMensagem.notificacao(diogenes);
        assertEquals("[SMS]HELLO diogenes", teste);
    }

}