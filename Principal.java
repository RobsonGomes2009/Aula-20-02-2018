package aula20_02_2018;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

	}

	private static void ex4() {
		
		
		Funcionario fun1 = new Funcionario("Joao", 20, 3.5);
		Funcionario fun2 = new Funcionario("Mateus", 40, 5.5);
		Funcionario fun3 = new Funcionario("Lucas", 40, 13.5);

		imprimeFuncionario(fun1);
		imprimeFuncionario(fun2);
		imprimeFuncionario(fun3);
	}

	
	private static void imprimeFuncionario(Funcionario funcionario) {
		System.out.println("Funcionario: " + funcionario.getNome());
		System.out.printf("Salario: %.2f\n\n", funcionario.calculaSalario());
	}

	
}
