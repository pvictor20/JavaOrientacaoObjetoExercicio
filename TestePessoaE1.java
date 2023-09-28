public class TestePessoaE1 {
    public static void main(String[] args) {
        PessoaE1 pessoa1 = new PessoaE1();

        pessoa1.setNome("Vito");
        pessoa1.setAltura(1.76);
        pessoa1.setIdade(21);

        PessoaE1 pessoa2 = new PessoaE1();

        pessoa2.setNome("Beatriz");
        pessoa2.setAltura(1.65);
        pessoa2.setIdade(20);

        String nomeDaPessoa2 = pessoa2.getNome();
        int  idadeDaPessoa2= pessoa2.getIdade();
        double alturaDaPessoa2 = pessoa2.getAltura();

        System.out.println("Nome: " + nomeDaPessoa2);
        System.out.println("Idade: " + idadeDaPessoa2);
        System.out.println("Altura: " + alturaDaPessoa2);

        System.out.println("");

        pessoa1.exibir_informacoes();
    }
}
