package main;

public class Fornecedor extends Juridica{

	private String codFornecedor;
	private String segmento;
	private String dataCadastro;
	private String contato;
	private String email;
	private String telefone;
	
	public Fornecedor() { /* construtor */}
	
	public Fornecedor(String nomeFantasia, String razaoSocial, String cnpj, String codFornecedor, String segmento, String dataCadastro, String contato, String email, String telefone) {
		super.setNomeFantasia(nomeFantasia);
		super.setRazaoSocial(razaoSocial);
		super.setCnpj(cnpj);
		this.setSegmento(segmento);
		this.setContato(contato);
		this.setEmail(email);
		this.setDataCadastro(dataCadastro);
		this.setTelefone(telefone);
		this.setCodFornecedor(codFornecedor);
	}

	public String getCodFornecedor() {
		return codFornecedor;
	}

	public void setCodFornecedor(String codFornecedor) {
		this.codFornecedor = codFornecedor;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return super.toString() + getCodFornecedor() + ";" + getSegmento() + ";" +getDataCadastro() + ";" + getContato() +";" + getTelefone() + ";" + getEmail();
	}
}
