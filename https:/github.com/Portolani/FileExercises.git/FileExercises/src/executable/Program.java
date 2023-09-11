package executable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Products> list = new ArrayList<>();
		
		System.out.println("How many products will be inserted? ");
		int qtdProducts = sc.nextInt();
		
		try {
			
			for(int i = 0; i < qtdProducts; i++) {
				System.out.print("Enter product's name: ");
				String name = sc.nextLine();
				sc.nextLine();
				System.out.print("Enter product's value: ");
				double value = sc.nextDouble();
				System.out.print("Enter unit: ");
				int unit = sc.nextInt();
				
				Products product = new Products(name, value, unit);
				list.add(product);
				
			}
		}
		catch(RuntimeException e) {
			e.getStackTrace();
		}
		
		sc.close();
		
		File path = new File(/home/felipe/Documentos/);
	}
}
