public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoAndre = new Conta();

        contaDoAndre.deposita(100);
        contaDoAndre.saca(5);
        contaDoAndre.saca(contaDoAndre.saldo + 1);

        Conta contaDaMillena = new Conta();
        contaDaMillena.deposita(1000);

        if (contaDaMillena.transfere(300, contaDoAndre)) {
            System.out.println("Transferencia com sucesso");
        } else {
            System.out.println("Falta de dinheiro");
        }

    }
}
