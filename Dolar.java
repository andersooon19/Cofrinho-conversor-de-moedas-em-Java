package uninter;

import java.text.NumberFormat;
import java.util.Locale;

public class Dolar extends Moeda {
	
	public Dolar(double valor) {
		this.valor = valor;
	}

	@Override
	public void info() {
		System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(valor));
	}

	@Override
	public double converter() {
		return this.valor * 5.34;
	}
}