package application;
import java.util.Scanner;

import entities.Product;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		System.out.println("Enter product: ");
		System.out.print("Name: ");
			product.name = sc.nextLine(); //leitura do input name
			
		System.out.print("Price: ");
			product.price = sc.nextDouble(); //leitura do input price
			
		System.out.print("Quantity in stock: ");
			product.quantity = sc.nextInt(); //leitura do input quantity
			
		System.out.println(product);

		
		/* System.out.println(product.name +" ," + product.price +" , " + product.quantity );  teste de entrada de dados  */ 
		
		sc.close();
	}

}
