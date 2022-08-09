public class TestaBanco {
    public static void main(String[] args) {
        Cliente andre = new Cliente();
        andre.cpf = "123.456.789-01";
        andre.nome = "andre carvalho";
        andre.profissao = "estagiario de ti";

        Conta contaDoAndre = new Conta();
        contaDoAndre.deposita(100);
        contaDoAndre.titular = andre;

        // associa o cliente andre para a conta contaDoAndre
        System.out.println(andre.cpf);
        System.out.println(contaDoAndre.titular.cpf);
    }
}
