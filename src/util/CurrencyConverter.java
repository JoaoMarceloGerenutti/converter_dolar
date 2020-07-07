package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double reais(double preco, double quantidade) {
		return quantidade * preco * (1.0 + IOF);
	}
	
}
