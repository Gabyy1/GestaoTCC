package controller;

import java.util.ArrayList;
import java.util.List;

import model.Aluno;

public class AlunoController implements Cadastro {

	private List<Aluno> alunos;

    public AlunoController() {
        alunos = new ArrayList<>();
    }
    
	public void adicionar() {
		Aluno aluno = new Aluno();
       
        aluno.setNome("Nome do Aluno");
        aluno.setEmail("email@exemplo.com");
        aluno.setTel("123456789");
        aluno.setCpf("12345678901");
        aluno.setRA("123456");
        aluno.setCurso("Curso do Aluno");

        alunos.add(aluno);

        System.out.println("Aluno adicionado com sucesso!");
    }
		

	public void excluir() {
		int indice = 0; // Índice do aluno a ser excluído
        if (indice >= 0 && indice < alunos.size()) {
            alunos.remove(indice);
            System.out.println("Aluno removido com sucesso!");
        } else {
            System.out.println("Aluno não encontrado!");
        }
	}

	public void alterar() {
		 int indice = 0; 
	        if (indice >= 0 && indice < alunos.size()) {
	            Aluno aluno = alunos.get(indice);

	            aluno.setNome("Novo Nome");

	            System.out.println("Informações do aluno alteradas com sucesso!");
	        } else {
	            System.out.println("Aluno não encontrado!");
	        }
	}

	public void listar() {
		 System.out.println("Lista de Alunos:");

	        for (Aluno aluno : alunos) {
	            System.out.println("Nome: " + aluno.getNome());
	            System.out.println("Email: " + aluno.getEmail());
	            System.out.println("Telefone: " + aluno.getTel());
	            System.out.println("CPF: " + aluno.getCpf());
	            System.out.println("RA: " + aluno.getRA());
	            System.out.println("Curso: " + aluno.getCurso());
	            System.out.println("-------------------------------------");
	        }
		
	}

}