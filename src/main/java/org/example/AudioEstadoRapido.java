package org.example;

public class AudioEstadoRapido implements AudioEstado{
    private AudioEstadoRapido() {};
    private static AudioEstadoRapido instance = new AudioEstadoRapido();
    public static AudioEstadoRapido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Rapido";
    }
}