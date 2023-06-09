package controller;

import java.util.ArrayList;
import java.util.List;

import model.Professor;

public class ProfessorController implements Cadastro {
	
	private List<Professor> professores; 

    public ProfessorController() {
        professores = new ArrayList<>();
    }

	public void adicionar() {
		Professor professor = new Professor();
		
        professor.setNome("Nome do Professor");
        professor.setEmail("email@exemplo.com");
        professor.setTel("123456789");
        professor.setCpf("12345678901");
        professor.setNumProfessor("123");

        professores.add(professor);

        System.out.println("Professor adicionado com sucesso!");
    }
		

	public void excluir() {
		int indice = 0; 
        if (indice >= 0 && indice < professores.size()) {
            professores.remove(indice);
            System.out.println("Professor removido com sucesso!");
        } else {
            System.out.println("Professor não encontrado!");
        }
		
	}

	public void alterar() {
		int indice = 0; 
        if (indice >= 0 && indice < professores.size()) {
            Professor professor = professores.get(indice);

            professor.setNome("Novo Nome");

            System.out.println("Informações do professor alteradas com sucesso!");
        } else {
            System.out.println("Professor não encontrado!");
        }
		
	}

	public void listar() {
		System.out.println("Lista de Professores:");

        for (Professor professor : professores) {
            System.out.println("Nome: " + professor.getNome());
            System.out.println("Email: " + professor.getEmail());
            System.out.println("Telefone: " + professor.getTel());
            System.out.println("CPF: " + professor.getCpf());
            System.out.println("Número de Professor: " + professor.getNumProfessor());
            System.out.println("-------------------------------------");
        }
		
	}

}