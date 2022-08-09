public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(-1, -1);

        // System.out.println(conta.getAgencia());
        // System.out.println(conta.getNumero());

        conta.setAgencia(-1);
        conta.setNumero(-1);

        // System.out.println(conta.getAgencia());
        // System.out.println(conta.getNumero());

        Conta c2 = new Conta(1, 1);
        Conta c3 = new Conta(1, 1);
        Conta c4 = new Conta(1, 1);
        Conta c5 = new Conta(1, 1);

        System.out.println("total : " + conta.getTotal());
    }
}
