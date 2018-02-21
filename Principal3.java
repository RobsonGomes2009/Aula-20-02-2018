package aula20_02_2018;

/* Ex 7
 */
	public class Principal3 {
		public static void main(String[] args) {
			Calculo c = new Calculo();

		c.credito(100);
		c.debito(40);
		System.out.println("Saldo: " + c.getSaldo());

	}
	
}
