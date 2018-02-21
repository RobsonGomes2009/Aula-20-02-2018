package aula20_02_2018;

/* Ex 1
*/
	public class Circulo {
		private int raio;
	
	public Circulo(int raio) {
		super();
		this.raio = raio;
	}

	public double calculaArea() {
		return Math.PI * raio * raio;
	}

	public double calculaPerimetro() {
		return 2 * Math.PI * raio;
	}
}
