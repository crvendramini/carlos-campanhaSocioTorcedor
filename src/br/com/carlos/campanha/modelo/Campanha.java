package br.com.carlos.campanha.modelo;

import java.util.Calendar;

public class Campanha {
	private Long id;
	private String Nome;
	private Times time;
	private Calendar dataInicio;
	private Calendar dataFim;
	
	
	
	public Campanha(Long id, String nome, Times time, Calendar dataInicio, Calendar dataFim) {
		this.id = id;
		Nome = nome;
		this.time = time;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}
	

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Times getTime() {
		return time;
	}
	public void setTime(Times time) {
		this.time = time;
	}
	public Calendar getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Calendar getDataFim() {
		return dataFim;
	}
	public void setDataFim(Calendar dataFim) {
		this.dataFim = dataFim;
	}
	

}
