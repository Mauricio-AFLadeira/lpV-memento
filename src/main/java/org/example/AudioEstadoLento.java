package org.example;

public class AudioEstadoLento implements AudioEstado{
    private AudioEstadoLento() {};
    private static AudioEstadoLento instance = new AudioEstadoLento();
    public static AudioEstadoLento getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Lento";
    }
}
