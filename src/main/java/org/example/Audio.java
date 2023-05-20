package org.example;

import java.util.ArrayList;
import java.util.List;

public class Audio {
    private AudioEstado estado;
    private List<AudioEstado> memento = new ArrayList<AudioEstado>();

    public AudioEstado getEstado() {
        return this.estado;
    }

    public void setEstado(AudioEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstadoAnterior(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice-1);
    }

    public void avancarEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice+1);
    }

    public List<AudioEstado> getEstados() {
        return this.memento;
    }

}
