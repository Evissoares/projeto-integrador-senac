package main;

import utils.ManipularDados;

public class FornecedorService {
	
	private final String CAMINHO = "FORNECEDOR.txt";

	public void salvarFornecedor(String nomeFantasia, String razaoSocial, String cnpj, String codFornecedor, String segmento, String dataCadastro, String contato, String email, String telefone) {

		Fornecedor f = new Fornecedor(nomeFantasia, razaoSocial, cnpj, codFornecedor, segmento, dataCadastro, contato, email, telefone);

		ManipularDados.salvar(CAMINHO, f.toString());

	}

	public void listarTodosOsFornecedores() {

		ManipularDados.ler(CAMINHO);

	}

}
