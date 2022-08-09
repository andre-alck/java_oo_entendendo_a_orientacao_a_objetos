public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1, 1);

        conta.setTitular(new Cliente());

        conta.getTitular().setNome("André Carvalho");
        conta.getTitular().setCpf("928.432.567-98");
        conta.getTitular().setProfissao("Estagiário de TI");

        Conta contaDoAndre = new Conta(1, 1);
        contaDoAndre.setTitular(conta.getTitular()); // ou seja, o titular da conta contaDoAndre é o mesmo titular conta
                                                     // conta

        System.out.println(contaDoAndre.getTitular().getNome());
        System.out.println(contaDoAndre.getTitular().getCpf());
        System.out.println(contaDoAndre.getTitular().getProfissao());

    }
}
