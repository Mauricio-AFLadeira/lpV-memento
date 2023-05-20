package org.example;

public class AudioEstadoMuitoLento implements AudioEstado{
    private AudioEstadoMuitoLento() {};
    private static AudioEstadoMuitoLento instance = new AudioEstadoMuitoLento();
    public static AudioEstadoMuitoLento getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Muito lento";
    }
}
