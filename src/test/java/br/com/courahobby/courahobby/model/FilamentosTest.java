package br.com.courahobby.courahobby.model;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FilamentosTest {

    Filamentos filamentos = new Filamentos();

    @Before
    public void setup() {
        filamentos.setFilamento("PLA", "PLA_Marmore", "3D Lab", 92f);
    }

    @Test
    public void tipoFilamento() {
        assertThat(filamentos.getFabricante(), is("3D Lab"));
    }

}
