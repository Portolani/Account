package classesWriterAndBuffer;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "/home/felipe/Documentos/out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new java.io.FileWriter(path))){/* Se eu colocar(path,true), 
		ele nao recria. Apenas continua salvando, sem apagar o conteúdo já existente */
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
 	}
}
