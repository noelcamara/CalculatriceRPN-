package edu.mermet.calc;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Rule;

import org.junit.rules.TestName;

public class CalculatriceTest {
    @Rule public TestName nomMethode = new TestName();

    @Test
    public void testAjoutDUnNombre1() {
        // données d'entrée
        Calculatrice calc = new Calculatrice();
        calc.entrer("12");
        // résultat attendu
        String attendu = "1: 12\n";
        // résultat effectif
        String effectif = calc.toString();
        assertEquals(nomMethode.getMethodName(), attendu, effectif);
    }
}
