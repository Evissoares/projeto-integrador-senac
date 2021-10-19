package main;

import utils.ManipularDados;

public class AlunoService {

	private final String CAMINHO = "ALUNOS.txt";

	public void salvarAluno(String nome, String cpf, String dataNasc, String matricula) {

		Aluno a = new Aluno(nome, cpf, dataNasc, matricula);

		ManipularDados.salvar(CAMINHO, a.toString());

	}

	public void listarTodosOsAlunos() {

		ManipularDados.ler(CAMINHO);

	}

}
