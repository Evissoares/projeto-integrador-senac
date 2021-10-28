package main;

public class Programa {

	public static void main(String[] args) {

		AlunoService a = new AlunoService();

		// Incluir Alunos
		System.out.println("Incluindo Alunos");
		a.salvarAluno("Aluno1","11.111.111-11","Sobrenome 1","1111","Analise",2021);
		a.salvarAluno("Aluno2","22.222.222-22","Sobrenome 2","2222","Banco de Dados",2021);

		// Listar Alunos
		System.out.println("\nListando Alunos");
		a.listarTodosOsAlunos();

		ProfessorService p = new ProfessorService();

		// Incluir Professor
		System.out.println("\nIncluindo Professores");
		p.salvarProfessor("1","Professor 1","33.333.333-33","Sobrenome 1","POO",2015);
		p.salvarProfessor("2","Professor 2","44.444.444-44","Sobrenome 2","Banco de Dados",2013);

		// Listar Alunos
		System.out.println("\nListando Professores");
		p.listarTodosOsProfessores();

		FornecedorService f = new FornecedorService();

		// Incluindo Fornecedores
		System.out.println("\nIncluindo Fornecedores");
		f.salvarFornecedor("Fornecedor 1", "Fornecedor Fantasia 1", "11.111.111.1111/11", "1", "Construção", "01/01/2020", "Contato 1", "email1@localhost.com", "(11) 1111-1111");
		f.salvarFornecedor("Fornecedor 2", "Fornecedor Fantasia 2", "22.222.222.2222/22", "2", "Informática", "01/01/2019", "Contato 2", "email2@localhost.com", "(22) 2222-2222");

		// Listar Fornecedores
		System.out.println("\nListando Fornecedores");
		f.listarTodosOsFornecedores();

		System.out.println("\nFinal de Execução do Programa.");
	}
}
