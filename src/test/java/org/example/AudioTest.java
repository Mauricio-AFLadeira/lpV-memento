package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AudioTest {
    @Test
    void deveArmazenarEstados() {
        Audio audio = new Audio();
        audio.setEstado(AudioEstadoNormal.getInstance());
        audio.setEstado(AudioEstadoRapido.getInstance());
        assertEquals(2, audio.getEstados().size());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Audio audio = new Audio();
        audio.setEstado(AudioEstadoNormal.getInstance());
        audio.setEstado(AudioEstadoRapido.getInstance());
        audio.setEstado(AudioEstadoMuitoRapido.getInstance());
        audio.restauraEstadoAnterior(1);
        assertEquals(AudioEstadoNormal.getInstance(), audio.getEstado());
    }

    @Test
    void deveRetornarEstadoPosterior() {
        Audio audio = new Audio();
        audio.setEstado(AudioEstadoNormal.getInstance());
        audio.setEstado(AudioEstadoRapido.getInstance());
        audio.setEstado(AudioEstadoMuitoRapido.getInstance());
        audio.avancarEstado(1);
        assertEquals(AudioEstadoMuitoRapido.getInstance(), audio.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Audio audio = new Audio();
            audio.restauraEstadoAnterior(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}