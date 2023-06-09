package controller;

import model.Aluno;

public class ProfessorTGController extends ProfessorController implements Avaliar {

	
	public void aprovaProjeto() {
		double nota = 7.5; 
        if (nota >= 6.0) {
            System.out.println("Projeto do Professor TG aprovado!");
        } else {
            System.out.println("Projeto do Professor TG não atingiu a nota mínima para aprovação!");
        }
		
	}

	public void reprovaProjeto() {
		double nota = 4.5; 
        if (nota < 6.0) {
            System.out.println("Projeto do Professor TG reprovado!");
        } else {
            System.out.println("Projeto do Professor TG atingiu a nota mínima para aprovação!");
        }		
	}

	public void atribuirNota() {
		double nota = 8.0;
        System.out.println("Nota " + nota + " atribuída ao TCC do Professor TG!");
		
	}
	
	public void buscarAluno(Aluno a) {
		String nomeAluno = a.getNome(); 
        System.out.println("Buscando aluno " + nomeAluno + " no banco de dados...");
	}

}