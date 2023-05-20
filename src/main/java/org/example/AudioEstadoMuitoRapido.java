package org.example;

public class AudioEstadoMuitoRapido implements AudioEstado{
    private AudioEstadoMuitoRapido() {};
    private static AudioEstadoMuitoRapido instance = new AudioEstadoMuitoRapido();
    public static AudioEstadoMuitoRapido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Muito rapido";
    }
}