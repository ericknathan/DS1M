package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadWriteFile {

	public static void main(String[] args) {
		
		// Procedimento para abrir um arquivo para leitura ou escrita
		
		// Passo 1 - Obter o caminho do arquivo
		Path path = Paths.get("C:/Users/21192998/clientes.txt");
		
		// Passo 2 - Criar o buffer para o arquivo
		try {
			BufferedReader reader = Files.newBufferedReader(path, Charset.forName("ISO-8859-1"));
						
			String line = reader.readLine();
			
			while(line != null) {
				String[] cliente = line.split(";");
				if(cliente[3].equals("SP")) {
					System.out.printf("\nID: %s\nNome: %s\nSal�rio: %s\n", cliente[0], cliente[1], cliente[6]);
				}
				line = reader.readLine();
			}

		} catch(IOException ex) {
			System.out.println("N�o foi poss�vel encontrar o arquivo espec�ficado!");
			ex.printStackTrace();
		}
		
		
		/*
		 * C:/Users/21192998/clientes.txt
		 */

		// Verificar se inclui o separador no campo de texto
		// Verificar se algum campo poss�i espa�os indevidos
		// Limitar campos pra evitar v�rzea xD
		
	}

}
