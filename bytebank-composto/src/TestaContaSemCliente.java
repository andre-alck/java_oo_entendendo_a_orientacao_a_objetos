public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();
        contaDaMarcela.titular = new Cliente();
        contaDaMarcela.titular.nome = "Marcela";
        System.out.println("contaDaMarcela.titular.nome : " + contaDaMarcela.titular.nome);

        Conta c = new Conta();
        Cliente cl = new Cliente();
        c.titular = cl;
        c.titular.nome = "c";
        System.out.println("c.titular.nome : " + c.titular.nome);
    }
}
