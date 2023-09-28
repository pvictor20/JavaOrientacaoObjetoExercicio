public class Elevador {
    private int andarAtual;
    private int totalAndaresPredio;
    private int capacidade;
    private int pessoasPresentes;

    public Elevador(int capacidade, int totalAndaresPredio) {
        this.capacidade = capacidade;
        this.totalAndaresPredio = totalAndaresPredio;
        this.andarAtual = 0; 
        this.pessoasPresentes = 0;
    }

    public void entra(int numeroPessoas) {
        if (pessoasPresentes + numeroPessoas <= capacidade) {
            pessoasPresentes += numeroPessoas;
            System.out.println(numeroPessoas + " pessoa(s) entrou/entraram no elevador.");
        } else {
            System.out.println("O elevador está cheio. Não é possível entrar.");
        }
    }

    public void sai(int numeroPessoas) {
        if (pessoasPresentes >= numeroPessoas) {
            pessoasPresentes -= numeroPessoas;
            System.out.println(numeroPessoas + " pessoa(s) saiu/saíram do elevador.");
        } else {
            System.out.println("Não há pessoas suficientes no elevador para sair.");
        }
    }

    public void sobe() {
        if (andarAtual < totalAndaresPredio) {
            andarAtual++;
            System.out.println("Elevador subiu para o andar " + andarAtual + ".");
        } else {
            System.out.println("O elevador já está no último andar.");
        }
    }

    public void desce() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Elevador desceu para o andar " + andarAtual + ".");
        } else {
            System.out.println("O elevador já está no térreo.");
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getTotalAndaresPredio() {
        return totalAndaresPredio;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }
}
