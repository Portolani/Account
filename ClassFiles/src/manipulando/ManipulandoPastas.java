package manipulando;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println();
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for(File folder : folders) {
			System.out.println(folder);/*Se eu colocar folder.getName(), o programa só imprime o nome do diretório */
		}
		
		System.out.println();
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files:");
		for(File file : files) {
			System.out.println(file);/*Se eu colocar file.getName(), o programa só imprime o nome do arquivo */
		}
		
		System.out.println();
		System.out.print("Would like to create a new directory?(y/n)");
		char resp = sc.nextLine().charAt(0);
		
		if(resp == 'y') {
			System.out.print("Enter new directory name: ");
			String dirName = sc.nextLine();
			boolean success = new File(strPath + "//" + dirName).mkdir();
			System.out.println("Directory created successful:" + success);
		}
		else {			
			System.out.println();
			System.out.println("Bye");
		}
		sc.close();
	}
}
