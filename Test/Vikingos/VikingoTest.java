package Vikingos;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VikingoTest {

    @Test
    void JarlNoVaAExpedicionPorqueEsEsclavoTest() {

        Jarl jarlCasta = new Jarl();
        Soldado soldado = new Soldado(jarlCasta, 100, 20, 3);

        Capital capital = new Capital(1, 100);

        List<Vikingo> listaVikingos = new ArrayList<>();

        listaVikingos.add(soldado);

        List<Lugar> listaLugares = new ArrayList<>();

        listaLugares.add(capital);

        Expedicion expedicion = new Expedicion(listaVikingos,listaLugares);

        boolean result = soldado.subirAExpedicion(soldado);

        assertEquals(false,result);
    }

    @Test
    void ThrallVaAExpedicionPorqueTest() {

        Thrall thrallCasta = new Thrall();
        Soldado soldado = new Soldado(thrallCasta, 100, 50, 50);
        Soldado soldado1 = new Soldado(thrallCasta, 100, 50, 50);
        Soldado soldado2 = new Soldado(thrallCasta, 100, 50, 50);
        Soldado soldado3 = new Soldado(thrallCasta, 100, 50, 50);
        Soldado soldado4 = new Soldado(thrallCasta, 100, 50, 50);

        Capital capital = new Capital(1, 100);

        List<Vikingo> listaVikingos = new ArrayList<>();

        listaVikingos.add(soldado);
        listaVikingos.add(soldado1);
        listaVikingos.add(soldado2);
        listaVikingos.add(soldado3);
        listaVikingos.add(soldado4);

        List<Lugar> listaLugares = new ArrayList<>();

        listaLugares.add(capital);

        Expedicion expedicion = new Expedicion(listaVikingos,listaLugares);

        boolean result = soldado.subirAExpedicion(soldado);

        assertEquals(true,result);

        System.out.println("hola");
    }

}