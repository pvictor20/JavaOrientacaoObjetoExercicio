/*
 Crie uma classe para representar uma pessoa, com os atributos privados de nome, idade
 e altura. Crie os métodos públicos necessários para sets e gets e também
 um método para imprimir os dados de uma pessoa.
 */
public class PessoaE1 {
    private String nome;
    private int idade;
    private double altura;


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void exibir_informacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
    }
}
