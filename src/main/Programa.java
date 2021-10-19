package main;

public class Programa {

	public static void main(String[] args) {

		FornecedorService f = new FornecedorService();
		
		f.salvarFornecedor("Everton", "11111111111", "14/12/1993", "Lógica");
		f.salvarFornecedor("Soares", "22222222222", "14/12/1994", "POO");
		f.listarTodosOsFornecedores();
		
	}
}
