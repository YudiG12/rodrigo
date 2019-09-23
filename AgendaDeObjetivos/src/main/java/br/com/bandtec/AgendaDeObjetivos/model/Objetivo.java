package br.com.bandtec.AgendaDeObjetivos.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

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

	@Embedded
	private Priority priority;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataMaximaParaExecucao() {
		return dataMaximaParaExecucao;
	}

	public void setDataMaximaParaExecucao(LocalDate dataMaximaParaExecucao) {
		this.dataMaximaParaExecucao = dataMaximaParaExecucao;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}
}
