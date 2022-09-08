package aplication;

import java.util.Scanner;

import entities.Retangle;

public class ProgramRetangle {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Retangle ret = new Retangle();
			
			System.out.println("Enter rectangle width and height: ");
			System.out.println("Digite a altura do retangulo: ");
			ret.altura = sc.nextDouble();
			System.out.println("digite a base do retangulo");
			ret.base = sc.nextDouble();

			
			System.out.println(ret.base);
			System.out.println(ret.altura);

			double areaRet = ret.area();

			System.out.println("A area do retangulo é igual a " + areaRet);

			double perRet = ret.perimetro();

			System.out.println("O perimetro do retangulo é igual a " + perRet);

			double diagRet = ret.diagonal();

			System.out.println("A diagonal do retangulo é igual a " + diagRet);
		}

	}
}
