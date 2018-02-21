package aula20_02_2018;

import java.util.Locale;
import java.util.Scanner;

public class Principal2 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

	}

private static void ex3() {
	
	
	Circulo c1 = new Circulo(32);
	Circulo c2 = new Circulo(44);
	Circulo c3 = new Circulo(17);

	imprimeCirculo(c1);
	imprimeCirculo(c2);
	imprimeCirculo(c3);

}
private static void imprimeCirculo(Circulo circulo) {
	System.out.printf("A area do Circulo: %.2f", circulo.calculaArea());
	System.out.printf("\nO perimetro do circulo: %.2f\n\n", circulo.calculaPerimetro());
}
}