package controller;

import java.util.Scanner;

import model.Aluno;
import model.Grupo;
import model.ProfessorTG;

public class GrupoController {
	
	public void definirOrientador(ProfessorTG orientador) {
		System.out.println("Orientador definido: " + orientador.getNome());
	}
	
	public void definirGrupo(Aluno[] alunos) {
		Grupo grupo = new Grupo();

		// Define os integrantes do grupo
		grupo.setIntegrantes(alunos);

		// Solicita o tema do TCC
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o tema do TCC:");
		String tema = scanner.nextLine();
		grupo.setTema(tema);

		System.out.println("Grupo definido com sucesso!");
	}
}
