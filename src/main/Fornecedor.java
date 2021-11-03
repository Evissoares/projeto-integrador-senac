package main;

import java.text.SimpleDateFormat;

public class Fornecedor extends Juridica{

	private String codFornecedor;
	private String segmento;
	private String dataCadastro;
	private String contato;
	private String email;
	private String telefone;
	
	public Fornecedor() { /* construtor */}
	
	public Fornecedor(String nomeFantasia, String razaoSocial, String cnpj, String codFornecedor, String segmento, String dataCadastro, String contato, String email, String telefone) {
		this.setCodFornecedor(codFornecedor);
		super.setNomeFantasia(nomeFantasia);
		super.setRazaoSocial(razaoSocial);
		super.setCnpj(cnpj);
		this.setSegmento(segmento);
		this.setDataCadastro(dataCadastro);
		this.setContato(contato);
		this.setTelefone(telefone);
		this.setEmail(email);
	}

	public String getCodFornecedor() {
		return codFornecedor;
	}

	public void setCodFornecedor(String codFornecedor) {
		if (codFornecedor.trim().isEmpty()) {
			throw new IllegalArgumentException("O código do fornecedor deve ser preenchido.");
		} else if (!codFornecedor.trim().matches("[0-9]+")) {
			throw new IllegalArgumentException("O código do fornecedor deve conter apenas números.");
		}
		this.codFornecedor = codFornecedor.trim();
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		if (segmento.trim().isEmpty()) {
			throw new IllegalArgumentException("O segmento do fornecedor deve ser preenchido.");
		} else if ( super.checkCharacterSpecial(segmento.trim())) {
			throw new IllegalArgumentException("O segmento do fornecedor não deve conter caracter especial.");
		}
		this.segmento = segmento.trim();
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		format.setLenient(false);
		if (dataCadastro.trim().isEmpty()) {
			throw new IllegalArgumentException("A data do Cadastro do fornecedor deve ser preenchido.");
		}
		try {
			format.parse(dataCadastro.trim());
		} catch (Exception $e){
			throw new IllegalArgumentException("A data do Cadastro do fornecedor deve ser preenchido.");
		}
     	this.dataCadastro = dataCadastro.trim();
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		if (contato.trim().isEmpty()) {
			throw new IllegalArgumentException("O contato do fornecedor deve ser preenchido.");
		} else if ( super.checkCharacterSpecial(contato.trim())) {
			throw new IllegalArgumentException("O contato do fornecedor não deve conter caracter especial.");
		}
		this.contato = contato.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.trim().isEmpty()) {
			throw new IllegalArgumentException("O e-mail do fornecedor deve ser preenchido.");
		} else if (!email.trim().matches("(.+)@(.+)\\.(.+)$")) {
			throw new IllegalArgumentException("O e-mail do fornecedor deve ser válido.");
		}
		this.email = email.trim();
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if (telefone.trim().isEmpty()) {
			throw new IllegalArgumentException("O telefone do fornecedor deve ser preenchido.");
		} else if (!telefone.trim().matches("^\\([1-9]{2}\\) [9]{0,1}[0-9]{4}\\-[0-9]{4}$")) {
			throw new IllegalArgumentException("O telefone do fornecedor deve ser válido.");
		}
		this.telefone = telefone.trim();
	}

	@Override
	public String toString() {
		return super.toString() + getCodFornecedor() + ";" + getSegmento() + ";" +getDataCadastro() + ";" + getContato() +";" + getTelefone() + ";" + getEmail();
	}
}
