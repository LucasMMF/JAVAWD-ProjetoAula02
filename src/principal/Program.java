package principal;

import java.util.Scanner;

import entities.Funcionario;
import repositories.FuncionarioRepository;

public class Program {

	public static void main(String[] args) {

		// syso + CTRL + espaço
		System.out.println("\n *** CADASTRO DE FUNCIONÁRIO *** \n");

		Funcionario funcionario = new Funcionario();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Entre com o id do funcionário.....: ");
		funcionario.setIdFuncionario(Integer.parseInt(scanner.nextLine()));

		System.out.print("Entre com o nome do funcionário...: ");
		funcionario.setNome(scanner.nextLine());

		System.out.print("Entre com a matrícula.............: ");
		funcionario.setMatricula(scanner.nextLine());

		System.out.print("Entre com o cpf...................: ");
		funcionario.setCpf(scanner.nextLine());

		scanner.close();

		try {

			// Criando um objeto para a classe FuncionarioRepository
			FuncionarioRepository funcionarioRepository = new FuncionarioRepository();

			// Gravando os dados do funcionário em arquivo
			funcionarioRepository.exportar(funcionario);

			// Imprimindo...
			System.out.println("\nFUNCIONÁRIO CADASTRADO COM SUCESSO!\n");
			System.out.println("\tID........: " + funcionario.getIdFuncionario());
			System.out.println("\tNOME......: " + funcionario.getNome());
			System.out.println("\tMATRICULA.: " + funcionario.getMatricula());
			System.out.println("\tCPF.......: " + funcionario.getCpf());
		} catch (Exception e) {

			// Imprimindo...
			System.out.println("\nFALHA AO CADASTRAR FUNCIONÁRIO!");

			// Imprimir o log do erro
			e.printStackTrace();

		}

	}

}
