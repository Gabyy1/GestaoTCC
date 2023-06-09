package model;

public class Grupo {
	
	private String tema;
	private Aluno[] integrantes = new Aluno[4];
	
	public String getTema() {
		return tema;
	}
	
	public void setTema(String tema) {
		this.tema = tema;
	}
	
	public Aluno[] getIntegrantes() {
		return integrantes;
	}
	
	public void setIntegrantes(Aluno[] integrantes) {
		this.integrantes = integrantes;
	}


}