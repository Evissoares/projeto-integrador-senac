package main;

public class Juridica extends Pessoa{
	
	private String inicioContrato;
	private String cnpj;
	
	
	public String getInicioContrato() {
		return inicioContrato;
	}

	public void setInicioContrato(String inicioContrato) {
		this.inicioContrato = inicioContrato;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return super.toString() + getCnpj() + ";" + getInicioContrato() + ";";
	}
	
	
	

}
