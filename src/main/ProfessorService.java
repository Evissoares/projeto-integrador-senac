package main;

import utils.ManipularDados;

public class ProfessorService {
	
	private final String CAMINHO = "PROFESSORES.txt"; 
	
	public void salvarProfessor(String nome, String cpf, String dataNasc, String disciplina) {
		
		Professor p = new Professor(nome, cpf, dataNasc, disciplina);
		
		ManipularDados.salvar(CAMINHO, p.toString());
		
	}
	
	public void listarTodosOsProfessores() {
		
		ManipularDados.ler(CAMINHO);
		
	}

}
