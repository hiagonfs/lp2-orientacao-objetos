public class Golden extends Cachorro {

    public Golden(String nome, int idade) {
        super(nome, idade, "Golden Retriever");
    }

    @Override
    public void emitirSom() {
        System.out.println(
            getNome() + " está latindo como Golden: Au au au!"
        );
    }
}
