public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;

			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			destino.deposita(valor);
			this.saldo -= valor;

			return true;
		}

		return false;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor <= 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode valor <= 0");
			return;
		}
		this.numero = numero;
	}

	public Conta(int agencia, int numero) {
		Conta.total++;

		this.setAgencia(agencia);
		this.setNumero(numero);

	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public static int getTotal() {
		return Conta.total;
	}

}