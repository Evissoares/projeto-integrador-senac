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
					incluirFornecedor();
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

	private static void incluirFornecedor() {
		String codFornecedor = "";
		String nomefantasia = "";
		String razaosocial = "";
		String segmento = "";
		String cnpj = "";
		String dataCadastro = "";
		String contato = "";
		String email = "";
		String telefone = "";
		System.out.println("Digite o codigo do fornecedor (Apenas Números):");
		codFornecedor = teclado.nextLine();
		System.out.println("Digite o nome fantasia do fornecedor (Não colocar caracteres especiais):");
		nomefantasia = teclado.nextLine();
		System.out.println("Digite oa razão social do fornecedor (Não colocar caracteres especiais):");
		razaosocial = teclado.nextLine();
		System.out.println("Digite o cnpj do fornecedor (No formato: 99.999.999/9999-99):");
		cnpj = teclado.nextLine();
		System.out.println("Digite o segmento do fornecedor (Não colocar caracteres especiais):");
		segmento = teclado.nextLine();
		System.out.println("Digite a data do cadastro do fornecedor (No formato: 99/99/99 ou 99/99/9999):");
		dataCadastro = teclado.nextLine();
		System.out.println("Digite o contato do fornecedor (Não colocar caracteres especiais):");
		contato = teclado.nextLine();
		System.out.println("Digite o telefone do fornecedor (No formato: (99) 9999-9999 ou (99) 99999-9999):");
		telefone = teclado.nextLine();
		System.out.println("Digite o e-mail do fornecedor( formato de e-mail válido):");
		email = teclado.nextLine();
		FornecedorService f= new FornecedorService();
		try {
			f.salvarFornecedor(nomefantasia, razaosocial, cnpj, codFornecedor, segmento, dataCadastro, contato, email, telefone);
		} catch (Exception $e) {
			System.out.println("\n*****************\nCadastro com Erro\n*****************");
			System.out.println("\n*****************\nRefaça o cadastro\n*****************");
			System.out.println($e.getMessage());
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
		System.out.println("Digite o codigo do professor (Apenas números):");
		codProfessor = teclado.nextLine();
		System.out.println("Digite o nome do professor (Não colocar caracteres especiais):");
		nome = teclado.nextLine();
		System.out.println("Digite o sobrenome do professor (Não colocar caracteres especiais):");
		sobrenome = teclado.nextLine();
		System.out.println("Digite o cpf do professor (exemplo: 999.999.999-99):");
		cpf = teclado.nextLine();
		System.out.println("Digite a disciplina do professor (Não colocar caracteres especiais):");
		disciplina = teclado.nextLine();
		System.out.println("Digite o ano de admissao (Apenas números com 4 posições):");
		anoAdmissao = teclado.nextLine();
		if (!anoAdmissao.matches("[0-9.]+")) {
			anoAdmissao = "0";
		}
		ProfessorService p = new ProfessorService();
		try {
			p.salvarProfessor(codProfessor, nome, cpf, sobrenome, disciplina, Integer.parseInt(anoAdmissao));
		} catch (Exception $e) {
			System.out.println("\n*****************\nCadastro com Erro\n*****************");
			System.out.println("\n*****************\nRefaça o cadastro\n*****************");
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
					incluirAluno();;
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

	private static void incluirAluno() {
		String matricula = "";
		String nome = "";
		String sobrenome = "";
		String cpf = "";
		String anoDoIngresso = "";
		String turma = "";
		System.out.println("Digite a matrícula do aluno (Apenas números):");
		matricula = teclado.nextLine();
		System.out.println("Digite o nome do aluno (Não colocar caracteres especiais):");
		nome = teclado.nextLine();
		System.out.println("Digite o sobrenome do aluno (Não colocar caracteres especiais):");
		sobrenome = teclado.nextLine();
		System.out.println("Digite o cpf do aluno (No formato: 999.999.999-99):");
		cpf = teclado.nextLine();
		System.out.println("Digite a turma do aluno (Apenas números):");
		turma = teclado.nextLine();
		System.out.println("Digite o ano do ingresso (Apenas números com 4 posições):");
		anoDoIngresso = teclado.nextLine();
		if (!anoDoIngresso.matches("[0-9.]+")) {
			anoDoIngresso = "0";
		}
		AlunoService a = new AlunoService();
		try {
			a.salvarAluno(nome,cpf,sobrenome,matricula,turma,Integer.parseInt(anoDoIngresso));
		} catch (Exception $e) {
			System.out.println("\n*****************\nCadastro com Erro\n*****************");
			System.out.println("\n*****************\nRefaça o cadastro\n*****************");
			System.out.println($e.getMessage());
		}
	}
}
