package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é o preço do dolar? ");
		double preco = sc.nextDouble();
		
		System.out.printf("Quantos dolares eu comprarei? ");
		double quantidade = sc.nextDouble();
		
		double resultado = CurrencyConverter.reais(preco, quantidade);
		
		System.out.printf("Quantos reais eu paguei: %.2f%n", resultado);
		
		sc.close();
	}

}
