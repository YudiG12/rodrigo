package br.com.bandtec.AgendaDeObjetivos.model;

import javax.persistence.Embeddable;

@Embeddable
public class Priority {

    private String nome;
    private String observacoes;

    protected Priority() {
    }

    public Priority(String nome, String observacoes) {
        super();
        this.nome = nome;
        this.observacoes = observacoes;
    }

    public String getNome() {
        return nome;
    }

    public String getObservacoes() {
        return observacoes;
    }
}
