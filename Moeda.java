package uninter;

public abstract class Moeda {
	double valor;

	public abstract void info();

	public abstract double converter();

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}