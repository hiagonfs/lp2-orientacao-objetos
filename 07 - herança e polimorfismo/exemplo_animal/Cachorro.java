public class Cachorro extends Animal {

    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está latindo: Au au!");
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public String toString() {
        return super.toString() + " | Raça: " + raca;
    }
}
