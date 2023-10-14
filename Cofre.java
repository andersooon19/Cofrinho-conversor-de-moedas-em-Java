package uninter;

import java.util.ArrayList;
import java.util.List;

public class Cofre {
	private List<Moeda> listaMoedas;

	public Cofre() {
		this.listaMoedas = new ArrayList<>();
	}

	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}

	public void remover(Moeda moeda) {
		for (Moeda m : this.listaMoedas) {

			if ((moeda instanceof Dolar) && (m.getValor() == moeda.getValor())) {
				this.listaMoedas.remove(m);
				break;
			}

			if ((moeda instanceof Euro) && (m.getValor() == moeda.getValor())) {
				this.listaMoedas.remove(m);
				break;
			}

			if ((moeda instanceof Real) && (m.getValor() == moeda.getValor())) {
				this.listaMoedas.remove(m);
				break;
			}
		}
	}

	public void listagemMoedas() {
		for (Moeda moeda : listaMoedas) {
			moeda.info();
		}
	}

	public void totalConvertido() {
		double total = 0;
		for (Moeda moeda : this.listaMoedas) {
			total = total + moeda.converter();
		}

		System.out.println(total);
	}

	public List<Moeda> getListaMoedas() {
		return listaMoedas;
	}

	public void setListaMoedas(List<Moeda> listaMoedas) {
		this.listaMoedas = listaMoedas;
	}
}