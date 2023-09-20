package MetodosMatematicos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*
		 * Divisão de Bolos: Crie um programa que solicite ao usuário o número de
		 * convidados e a quantidade de bolo disponível. Use Math.ceil para calcular
		 * quantos bolos inteiros são necessários para que cada convidado receba uma
		 * fatia inteira.
		 */

		int quantidadeConvidados = 0, quantidadeBolo;

		Scanner sc = new Scanner(System.in);

		do {

			try {

				System.out.println("Insira a quantidade de convidados para a festa : ");

				quantidadeConvidados = sc.nextInt();

				System.out.println("Insira a quantidade de bolo para a festa : ");

				quantidadeBolo = sc.nextInt();

				if (quantidadeConvidados < 0 || quantidadeBolo < 0) {
					System.out.println("Nao e possivel inserir numeros negativos \nERRO!");
					break;

				}

			} catch (InputMismatchException e) {
				System.out.println("Apenas numeros sao permitidos nesse campo \nERRO!");
				break;
			}

			System.out.println("Numero de convidados = " + quantidadeConvidados);

			System.out.println("Quantidade de bolo = " + quantidadeBolo);

			System.out.println();

			int bolosInteirosNecessarios = (int) Math.ceil((double) quantidadeConvidados / quantidadeBolo);

			System.out.println("Para cada convidado, a quantidade de bolos inteiros necessarios será igual a "
					+ bolosInteirosNecessarios);
			break;

		}

		while (quantidadeConvidados != 0 && quantidadeBolo != 0);

		sc.close();

	}

}
