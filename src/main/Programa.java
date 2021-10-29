package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		while (true) {
			int opcao = 0;

			menuPrincipal();
			opcao = selecionaOpcao();
	
			switch(opcao) {
				case 1:
					menuProfessor();;
					break;
				case 2:
					menuAluno();
					break;
				case 3:
					menuFornecedor();
					break;
				case 4:
					sistemaEncerrado();
					System.exit(0);
				default:
					opcaoErrada();
					break;
			}
	
		}
		/*
		AlunoService a = new AlunoService();

		// Incluir Alunos
		System.out.println("Incluindo Alunos");
		try {
			a.salvarAluno("Aluno 1","111.111.111-11","Sobrenome 1","11","Analise",2021);
		} catch (Exception $e) {
			System.out.println($e.getMessage());
		}
		a.salvarAluno("Aluno2","222.222.222-22","Sobrenome 2","2222","Banco de Dados",2021);

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

		*/
	}

	private static void menuPrincipal() {
        System.out.println("================================");
        System.out.println("======= Sistema EducaTec =======");
        System.out.println("================================");
        System.out.println("============= Menu =============");
        System.out.println("======== 1- Professor ==========");
        System.out.println("======== 2- Aluno ==============");
        System.out.println("======== 3- Fornecedor =========");
        System.out.println("======== 4- Sair ===============");
    }

	private static void menuCadastros(String entidade) {
        System.out.println("-> " + entidade);
        System.out.println("======== 1- Cadastrar ==========");
        System.out.println("======== 2- Listar =============");
        System.out.println("======== 3- Voltar =============");
    }

	private static void opcaoErrada() {
        System.out.println();
        System.out.println("======= Opcao Incorreta ========");
        System.out.println();
    }

    private static void sistemaEncerrado() {
        System.out.println();
        System.out.println("===== Encerrando Sistema =======");
        System.out.println();
    }

    private static int selecionaOpcao(){
        System.out.println("Opcao Desejada:");
        try {
            return Integer.parseInt(teclado.nextLine());
        }catch(InputMismatchException e) {
            return 0;
        }catch(NumberFormatException f) {
            return 0;
        }
    }

	private static void menuFornecedor() {
		
		Boolean ficar = true;

		while (ficar) {
			int opcao = 0;

			menuCadastros("Fornecedor");
			opcao = selecionaOpcao();
	
			switch(opcao) {
				case 1:
					//MenuCadastros.iniciar("Professor");
					break;
				case 2:
					System.out.println("\nListando Fornecedores");
					try {
						FornecedorService f = new FornecedorService();
						f.listarTodosOsFornecedores();
						System.out.println("\nFim da Listagem de Fornecedores");
					} catch (Exception $e) {
						System.out.println("\n**********\nProblema no Acesso ao Arquivo de Fornecedores\n**********");
					}
					break;
				case 3:
					ficar = false;
				default:
					opcaoErrada();
					break;
			}
		}
	}

	private static void menuProfessor() {
		
		Boolean ficar = true;

		while (ficar) {
			int opcao = 0;

			menuCadastros("Professor");
			opcao = selecionaOpcao();
	
			switch(opcao) {
				case 1:
					incluirProfessor();
					break;
				case 2:
					System.out.println("\nListando Professores");
					ProfessorService p = new ProfessorService();
					p.listarTodosOsProfessores();
					System.out.println("\nFim da Listagem de Professores");
					break;
				case 3:
					ficar = false;
				default:
					opcaoErrada();
					break;
			}
		}
	}

	private static void incluirProfessor() {
		String codProfessor = "";
		String nome = "";
		String sobrenome = "";
		String cpf = "";
		String anoAdmissao = "";
		String disciplina = "";
		System.out.println("Digite o codigo do professor:");
		codProfessor = teclado.nextLine();
		System.out.println("Digite o nome do professor:");
		nome = teclado.nextLine();
		System.out.println("Digite o sobrenome do professor:");
		sobrenome = teclado.nextLine();
		System.out.println("Digite o cpf do professor:");
		cpf = teclado.nextLine();
		System.out.println("Digite a disciplina do professor:");
		disciplina = teclado.nextLine();
		System.out.println("Digite o ano de admissao:");
		anoAdmissao = teclado.nextLine();
		if (!anoAdmissao.matches("[0-9.]+")) {
			anoAdmissao = "0";
		}
		ProfessorService p = new ProfessorService();
		try {
			p.salvarProfessor(codProfessor, nome, cpf, sobrenome, disciplina, Integer.parseInt(anoAdmissao));
		} catch (Exception $e) {
			System.out.println("\n*****************\nCadastro com Erro\n*****************");
			System.out.println($e.getMessage());
		}
	}

	private static void menuAluno() {
		
		Boolean ficar = true;

		while (ficar) {
			int opcao = 0;

			menuCadastros("Aluno");
			opcao = selecionaOpcao();
	
			switch(opcao) {
				case 1:
					//MenuCadastros.iniciar("Professor");
					break;
				case 2:
					System.out.println("\nListando Alunos");
					try {
						AlunoService a = new AlunoService();
						a.listarTodosOsAlunos();
						System.out.println("\nFim da Listagem de Alunos");
					} catch (Exception $e) {
						System.out.println("\n**********\nProblema no Acesso ao Arquivo de Alunos\n**********");
					}break;
				case 3:
					ficar = false;
				default:
					opcaoErrada();
					break;
			}
		}
	}
}
