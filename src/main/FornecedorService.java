package main;

import utils.ManipularDados;

public class FornecedorService {
	
	private final String CAMINHO = "FORNECEDOR.txt";

	public void salvarFornecedor(String nome, String cnpj, String inicioContrato, String segmento) {

		Fornecedor f = new Fornecedor(nome, cnpj, inicioContrato, segmento);

		ManipularDados.salvar(CAMINHO, f.toString());

	}

	public void listarTodosOsFornecedores() {

		ManipularDados.ler(CAMINHO);

	}

}
