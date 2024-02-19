package repositories;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import entities.Funcionario;

public class FuncionarioRepository {

	// Método para gravar os dados de um funcionário em um arquivo
	public void exportar(Funcionario funcionario) throws Exception {

		// Criando um arquivo em modo de escrita
		PrintWriter printWriter = new PrintWriter(
				new FileOutputStream(new File("D:\\temp\\java\\webdeveloper\\funcionario.txt"), true));

		// Escrever o conteudo do arquivo
		printWriter.write("\n\nDADOS DO FUNCIONÁRIO:");

		printWriter.write("\nID.........: " + funcionario.getIdFuncionario());
		printWriter.write("\nNOME.......: " + funcionario.getNome());
		printWriter.write("\nMATRICULA..: " + funcionario.getMatricula());
		printWriter.write("\nCPF........: " + funcionario.getCpf());

		// Salvar o arquivo
		printWriter.flush();

		// Fechar o arquivo
		printWriter.close();

	}

}
