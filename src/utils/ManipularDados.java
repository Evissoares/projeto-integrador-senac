package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class ManipularDados {

	public static void salvar(String caminho, String dados) {
		
		File f = new File(caminho);
		
		try (
				
				FileWriter fr = new FileWriter(f, true);
				BufferedWriter buffer = new BufferedWriter(fr);
				){
			
			@SuppressWarnings("unused")
			boolean isCreated = f.createNewFile();
			
			buffer.write(dados);
			buffer.newLine();
			buffer.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void ler(String caminho) {
		
		File f = new File(caminho);

		try (
				FileReader fr = new FileReader(f); 
				BufferedReader buffer = new BufferedReader(fr);

		) {

			String linhas;
			while((linhas = buffer.readLine()) != null){
				
				System.out.println(linhas);
			}

		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
}
