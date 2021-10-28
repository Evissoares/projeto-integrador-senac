package main;

import utils.ManipularDados;

public class ProfessorService {
	
	private final String CAMINHO = "PROFESSORES.txt"; 
	
	public void salvarProfessor(String codProfessor, String nome, String cpf, String sobrenome, String disciplina, Integer anoAdmissao) {
		
		Professor p = new Professor(codProfessor, nome, cpf, sobrenome, disciplina, anoAdmissao);
		
		ManipularDados.salvar(CAMINHO, p.toString());
		
	}
	
	public void listarTodosOsProfessores() {
		
		ManipularDados.ler(CAMINHO);
		
	}

}
