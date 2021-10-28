package main;

public class Programa {

	public static void main(String[] args) {

		AlunoService a = new AlunoService();

		// Incluir Alunos
		System.out.println("Incluindo Alunos");
		try {
			a.salvarAluno("Aluno 1","111.111.111-11","Sobrenome 1","11","Analise",2021);
		} catch (Exception $e) {
			System.out.println($e.getMessage());
		}
		a.salvarAluno("Aluno2","222.222.222-22","Sobrenome 2","2222","Banco de Dados",2021);

		// Listar Alunos
		System.out.println("\nListando Alunos");
		try {
			a.listarTodosOsAlunos();
		} catch (Exception $e) {
			System.out.println($e.getMessage());
		}

		ProfessorService p = new ProfessorService();

		// Incluir Professor
		System.out.println("\nIncluindo Professores");
		try {
			p.salvarProfessor("1","Professor 1","33.333.333-33","Sobrenome 1","POO",2015);
		} catch (Exception $e) {
			System.out.println($e.getMessage());
		}
		try {
			p.salvarProfessor("2","Professor 2","44.444.444-44","Sobrenome 2","Banco de Dados",2013);
		} catch (Exception $e) {
			System.out.println($e.getMessage());
		}

		// Listar Professores
		System.out.println("\nListando Professores");
		try {
			p.listarTodosOsProfessores();
		} catch (Exception $e) {
			System.out.println(($e.getMessage()));
		}

		FornecedorService f = new FornecedorService();

		// Incluindo Fornecedores
		System.out.println("\nIncluindo Fornecedores");
		try {
			f.salvarFornecedor("Fornecedor 1", "Fornecedor Fantasia 1", "11.111.111/1111-11", "1", "Construção", "01/01/2020", "Contato 1", "email1@localhost.com", "(11) 1111-1111");
		} catch (Exception $e) {
			System.out.println($e.getMessage());
		}
		try {
			f.salvarFornecedor("Fornecedor 2", "Fornecedor Fantasia 2", "22.222.222/2222-22", "2", "Informatica", "01/01/20", "Contato 2", "email2@localhost.com", "(22) 2222-2222");
		} catch (Exception $e) {
			System.out.println($e.getMessage());
		}

		// Listar Fornecedores
		System.out.println("\nListando Fornecedores");
		try {
			f.listarTodosOsFornecedores();
		} catch (Exception $e) {
			System.out.println($e.getMessage());
		}

		System.out.println("\nFinal de Execução do Programa.");
	}
}
