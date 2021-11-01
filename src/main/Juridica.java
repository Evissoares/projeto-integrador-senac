package main;

public class Juridica {
	
	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		if (nomeFantasia.trim().isEmpty()) {
			throw new IllegalArgumentException("O Nome Fantasia do fornecedor deve ser preenchido.");
		} else if ( checkCharacterSpecial(nomeFantasia.trim())) {
			throw new IllegalArgumentException("O Nome Fantasia não pode conter caracteres especiais.");
		}
		this.nomeFantasia = nomeFantasia.trim();
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		if (razaoSocial.trim().isEmpty()) {
			throw new IllegalArgumentException("A Razão Social do fornecedor deve ser preenchido.");
		} else if ( checkCharacterSpecial(razaoSocial.trim())) {
			throw new IllegalArgumentException("A Razão Social não pode conter caracteres especiais.");
		}
		this.razaoSocial = razaoSocial.trim();
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		if (cnpj.trim().isEmpty()) {
			throw new IllegalArgumentException("O CNPJ do fornecedor deve ser preenchido.");
		} else if (!cnpj.trim().matches("^[0-9]{2}\\.[0-9]{3}\\.[0-9]{3}\\/[0-9]{4}\\-[0-9]{2}$")) {
			throw new IllegalArgumentException("O CNPJ do fornecedor deve ser válido.");
		}
		this.cnpj = cnpj.trim();
	}

	@Override
	public String toString() {
		return getCnpj() + ";" + getNomeFantasia() + ";" + getRazaoSocial() + ";";
	}

	public Boolean checkCharacterSpecial(String str) {
		String specialChars = "!@#$%*'+,¨~\"/:;<=>?[]^_`{|}§";
		for (int i = 0; i < str.length(); i++) {
			String strChar = Character.toString(str.charAt(i));
			if (specialChars.contains(strChar)) {
				return true;
			}
		}
		return false;
	}
}
