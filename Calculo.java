package aula20_02_2018;

/* Ex 7
 */
	public class Calculo {
		private int Saldo = 0;
	
		public int getSaldo() {
			return Saldo;
		}
	
		public void credito(int valor) {
			this.Saldo += valor;
		}
	
		public void debito(int valor) {
		this.Saldo -= valor;
	}
}
