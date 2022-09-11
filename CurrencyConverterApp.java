package aplication;

import java.util.Scanner;

import util.CurrencyConverter;

public class CurrencyConverterApp {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CurrencyConverter conv = new CurrencyConverter();
		CurrencyConverter desc = new CurrencyConverter();
		CurrencyConverter rf = new CurrencyConverter();
		
		System.out.println("what is the dollar price?  ");
		 double cotDolar = sc.nextDouble();
		System.out.println("How many dollars will be bought?  ");
		double quantDolar = sc.nextDouble();
	     double resultado = conv.converterDolar( cotDolar,  quantDolar);
	     double imposto  = desc.valorDesconto(resultado);
	     double resultadoFinal = rf.resultadoFinal(resultado, imposto);
		System.out.println("Amount to be paid reais = " + resultadoFinal);
		
		
		
		
		sc.close();
	}


}
