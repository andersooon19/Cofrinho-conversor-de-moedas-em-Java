package uninter;

import java.util.Scanner;

public class Principal {
	public static void menu() {
		System.out.println("Cofre inteligente");
		
		System.out.println("Compativel com diversas moedas\nExemplo: Euro, Dolar, Real");
		
		System.out.println("1. Inserir Euro");
		System.out.println("2. Inserir Dolar");
		System.out.println("3. Inserir Real\n");

		System.out.println("Remover moedas");
		System.out.println("4. Remover Dolar");
		System.out.println("5. Remover Euro");
		System.out.println("6. Remover Real\n");

		System.out.println("7. Exibir todas as moedas");
		System.out.println("8. Calcular quanto dinheiro tem no cofrinho convertido em Real");
		System.out.println("0. Fechar\n");

		System.out.print("Selecione uma das alternativa: ");
	}

	public static void main(String[] args) {
		int opcao;
		Scanner entrada = new Scanner(System.in);

		Cofre cofre = new Cofre();
		Dolar dolar;
		Euro euro;
		Real real;

		System.out.println("Cofrinho de Moedas\n");

		do {
			menu();
			opcao = entrada.nextInt();
			if(opcao == 1)
			{
				System.out.println("\nAlternativa adicionar Moeda");
				System.out.print("Informe o valor em euro: ");
				euro = new Euro(entrada.nextDouble());
				cofre.adicionar(euro);
				System.out.println("Moeda Adicionada!\n");
			}
			else if(opcao == 2)
			{
				System.out.println("\nAlternativa adicionar Moeda");
				System.out.print("Informe o valor em dolar: ");
				dolar = new Dolar(entrada.nextDouble());
				cofre.adicionar(dolar);
				System.out.println("Moeda Adicionada!\n");
			}
			else if(opcao == 3)
			{
				System.out.println("\nAlternativa adicionar Moeda");
				System.out.print("Informe o valor em real: ");
				real = new Real(entrada.nextDouble());
				cofre.adicionar(real);
				System.out.println("Moeda Adicionada!\n");
			}
			else if(opcao == 4)
			{
				System.out.println("\nAlternativa remover Moeda");
				System.out.print("Informe o valor em dolar: ");
				dolar = new Dolar(entrada.nextDouble());
				cofre.remover(dolar);
				System.out.println("Moeda Removida!\n");
			}
			else if(opcao == 5)
			{
				System.out.println("\nAlternativa remover moeda em euro");
				System.out.print("Informe o valor em euro: ");
				euro = new Euro(entrada.nextDouble());
				cofre.remover(euro);
				System.out.println("Moeda Removida!\n");
			}
			else if(opcao == 6)
			{
				System.out.println("\nAlternativa remover moeda em real");
				System.out.print("Informe o valor em euro: ");
				real = new Real(entrada.nextDouble());
				cofre.remover(real);
				System.out.println("Moeda Removida!\n");
			}
			else if(opcao == 7)
			{
				System.out.println("\nMoedas no Cofrinho");
				cofre.listagemMoedas();
				System.out.println("\n");
			}
			else if(opcao == 8)
			{
				System.out.println("\nValor Total no Cofrinho");
				cofre.totalConvertido();
				System.out.println("\n");

			}
			else
			{
				System.out.println("Opção inválida.\n");
				System.out.println("\n");
			}
		} while (opcao != 0);

		entrada.close();
	}
}