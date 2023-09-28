public class TesteElevador {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(10, 5); // Elevador com capacidade de 10 pessoas e 5 andares no prédio

        System.out.println("Andar Atual: " + elevador.getAndarAtual());
        System.out.println("Pessoas Presentes: " + elevador.getPessoasPresentes());

        elevador.entra(3); // Entra 3 pessoas
        elevador.sobe();   // Sobe um andar
        elevador.entra(7); // Tenta entrar mais 7 pessoas (não caberá)
        elevador.sobe();   // Sobe um andar
        elevador.sobe();   // Sobe um andar (chegou ao último andar)
        elevador.desce();  // Desce um andar
        elevador.sai(2);   // Sai 2 pessoas

        System.out.println("Andar Atual: " + elevador.getAndarAtual());
        System.out.println("Pessoas Presentes: " + elevador.getPessoasPresentes());
    }
}
