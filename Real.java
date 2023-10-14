package uninter;

import java.text.NumberFormat;
import java.util.Locale;

public class Real extends Moeda {
	public Real(double valor) {
		this.valor = valor;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void info() {
		System.out.println(NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(valor));
	}

	@Override
	public double converter() {
		return this.valor;
	}
}