package main;

public class Fornecedor extends Juridica{
	
	
	private String segmento;
	
	public Fornecedor() {}
	
	public Fornecedor(String nome, String cnpj, String inicioContrato, String segmento) {
		super.setNome(nome);
		super.setCnpj(cnpj);
		super.setInicioContrato(inicioContrato);
		this.segmento = segmento;
		
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	@Override
	public String toString() {
		return super.toString() + getSegmento();
	}
	
	

}
