package com.diogeneskonorath.coreEngeneering.tema11;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SucoFactoryTest {
    @Test
    public void maquinaDeSucoLaranjaTest(){
        Suco suco = SucoFactory.maquinaDeSuco(Frutas.LARANJA);
        String sucoTest="Suco de laranja";
        Assert.assertTrue(suco.equals(sucoTest));
    }
    @Test
    public void maquinaDeSucoUvaTest(){
    Suco suco = SucoFactory.maquinaDeSuco(Frutas.UVA);
        String sucoTest="Suco de uva";
        Assert.assertTrue(suco.equals(sucoTest));
    }

    @Test(expected = SucoException.class)
    public void maquinaDeSucoFrutaInvalidaTest(){
        Suco suco = SucoFactory.maquinaDeSuco(Frutas.MORANGO);
        assertNotNull(suco);
    }
    @Test (expected = SucoException.class)
    public void maquinaDeSucoNullTest(){
        Suco suco = SucoFactory.maquinaDeSuco(null);
    }

}