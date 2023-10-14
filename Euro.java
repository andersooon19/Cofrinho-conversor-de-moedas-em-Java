package uninter;

import java.text.NumberFormat;
import java.util.Locale;

public class Euro extends Moeda {
	public Euro(double valor) {
		this.valor = valor;
	}

	@Override
	public void info() {
		System.out.println(NumberFormat.getCurrencyInstance(Locale.FRANCE).format(valor));
	}

	@Override
	public double converter() {
		return this.valor * 5.40;
	}
}