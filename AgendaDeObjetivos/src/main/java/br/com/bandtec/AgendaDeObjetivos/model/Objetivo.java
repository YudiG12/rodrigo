package br.com.bandtec.AgendaDeObjetivos.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_OBJETIVOS")
public class Objetivo {

        @Id
        @GeneratedValue
        private int id;
    
	@JsonProperty
	private String titulo;
	
	@JsonProperty
	private String descricao;
	
        @Column(name = "DT_MAX_EXECUCAO")
	@JsonProperty
	private LocalDate dataMaximaParaExecucao;
	
	public Objetivo() {}
	
	public Objetivo(String titulo, String descricao, LocalDate dataMaximaParaExecucao) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataMaximaParaExecucao = dataMaximaParaExecucao;
	}

	@Override
	public String toString() {
		return "Objetivo [titulo=" + titulo + ", descricao=" + descricao + ", dataMaximaParaExecucao="
				+ dataMaximaParaExecucao + "]";
	}

	public boolean ate(LocalDate data) {
		return dataMaximaParaExecucao.isBefore(data) || dataMaximaParaExecucao.isEqual(data);
	}

	/*
	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public LocalDate getDataMaximaParaExecucao() {
		return dataMaximaParaExecucao;
	}*/
}
