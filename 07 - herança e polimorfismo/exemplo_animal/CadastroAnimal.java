import java.util.ArrayList;

public class CadastroAnimal {

    private ArrayList<Animal> animais;

    public CadastroAnimal() {
        animais = new ArrayList<Animal>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public ArrayList<Gato> buscarGatos() {
        ArrayList<Gato> gatosEncontrados = new ArrayList<Gato>();

        for (Animal animal : animais) {
            if (animal instanceof Gato) {
                Gato gato = (Gato) animal;
                gatosEncontrados.add(gato);
            }
        }

        return gatosEncontrados;
    }

    public void todosEmitiremSom() {
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }

    public void listarAnimais() {
        for (Animal animal : animais) {
            System.out.println(animal);
        }
    }

    public int getQuantidadeAnimais() {
        return animais.size();
    }
}
