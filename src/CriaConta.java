
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = primeiraConta.saldo + 100;
		System.out.println(segundaConta.saldo);

		segundaConta.agencia = 321;
		System.out.println("Agencia da primeira conta:\t" + primeiraConta.agencia);
		System.out.println("Agencia da segunda conta:\t" + segundaConta.agencia);

		System.out.println(primeiraConta == segundaConta);
	}
}
