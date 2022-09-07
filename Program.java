package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); // instanciando o obj Scanner
		
		Product product = new Product(); // instanciando a classe product
		System.out.println("Ener product data :  "); 
		System.out.println("Name: ");
		product.name = sc.nextLine(); // coletando do teclado o nome do produto e alocando na variavel name, la em product
		System.out.println("Price: ");
		product.price = sc.nextDouble();// coletando o preco e alocando na variavel price
		System.out.println("quantity in Stock: ");
		product.quantity = sc.nextInt(); //coletando a quantidade e alocando na variavel 
		
		System.out.println("");
		System.out.println("Product data : " + product); // print na tela os atributos da classe product 
		
		System.out.println("");
		System.out.println("enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProduct(quantity);
		
		System.out.println("update data: "+ product );
		System.out.println("enter the of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("");
		System.out.println("update data "+ product);
		
		sc.close();
		
		    

	}

}
