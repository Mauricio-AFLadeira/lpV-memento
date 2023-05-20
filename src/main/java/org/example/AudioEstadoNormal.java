package org.example;

public class AudioEstadoNormal implements AudioEstado{
    private AudioEstadoNormal() {};
    private static AudioEstadoNormal instance = new AudioEstadoNormal();
    public static AudioEstadoNormal getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Normal";
    }
}