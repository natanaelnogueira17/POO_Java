package aplication;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioArrayDois {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String [] nomes = new String[n];
		int[] idade = new int [n];
		double [] altura = new double [n];
		for(int i = 0; i<n; i++) {
			System.out.println("dados da " + (i +1)+ " pessoa: ");
			System.out.print("nome: ");
			nomes[i] = sc.next();
			System.out.println("idade: ");
			idade[i] = sc.nextInt();
			System.out.println("altura: ");
			altura [i] = sc.nextDouble(); 
		}
		
		double soma = 0.0;
		for(int i = 0; i<n; i++) {
			soma = soma + altura[i];
		}
		
		double mediaAlturas = soma / n;
		System.out.println("media de altura: " + mediaAlturas);
		
		int cont = 0;
		for(int i = 0; i<n; i++) {
			if(idade[i] < 16) {
				cont = cont +1;
			}
		}
		
		double perc = cont * 100.0 /n;
		System.out.printf("Pessoas menor que 16 anos:  %.1f%%%n",perc);
		
		for(int i = 0; i<n; i++) {
			if(idade[i] < 16) {
				System.out.println(nomes [i]);
			}
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}}
