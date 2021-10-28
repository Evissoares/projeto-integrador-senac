package main;

import utils.ManipularDados;

public class AlunoService {

	private final String CAMINHO = "ALUNOS.txt";

	public void salvarAluno(String nome, String cpf, String sobrenome, String matricula, String turma, Integer anodeingresso) {

		Aluno a = new Aluno(nome, cpf, sobrenome, matricula, turma, anodeingresso);

		ManipularDados.salvar(CAMINHO, a.toString());

	}

	public void listarTodosOsAlunos() {

		ManipularDados.ler(CAMINHO);

	}

}
