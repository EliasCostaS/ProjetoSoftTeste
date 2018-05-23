package com.eliascosta.aula.dominio;

public class Pessoa {

	private String nome;

	public void setNome(String nome){
		this.nome = nome;	
	}
	public String getNome(){
		return this.nome;
	}


	private int idade;

	public void setIdade(int idade){
		this.idade = idade;
	}

	public int getIdade(){
		return this.idade;

	}

	private String cpf;

	public void setCpf(String cpf){
		this.cpf = cpf;	
	}
	public String getCpf(){
		return this.cpf;
	}

	private String telefone;

	public void setTelefone (String telefone){
		this.telefone = telefone;	
	}
	public String getTelefone(){
		return this.telefone;
	}

	private String Celular;

	public void setCelular (String celular){
		this.Celular = celular;
	}
	public String getCelular(){
		return this.Celular;
	}

	private String Rg;

	public void setRg(String rg){
		this.Rg = rg;
	}
	public String getRg(){
		return this.Rg;
	}


	private String estadocivil;

	public void setEstadocivil(String estadocivil){
		this.estadocivil = estadocivil;

	}
	public String getEstadocivil(){
		return this.estadocivil;
	}

	private Float altura;

	public void setAltura(Float altura){
		this.altura = altura;

	}
	public Float getAltura (){
		return this.altura;
	}
	
	public String falar(){
		return "Olá meu nome é " + this.nome +
				"\n" +
				"Eu tenho " + this.idade + " Anos de idade" +
				"\n" +
				"Atualmente estou " + this.estadocivil +
				"\n" +
				"E quando precisar de mim, me ligue no meu" +
				"Celular é" + this.Celular;
				
	}

}
