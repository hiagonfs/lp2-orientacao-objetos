import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CadastroAnimal cadastro = new CadastroAnimal();

        Animal animal = new Animal(
            "Animal desconhecido",
            4
        );

        Cachorro cachorro = new Cachorro(
            "Rex",
            6,
            "Pastor Alemão"
        );

        Gato gato1 = new Gato("Mimi", 2);
        Gato gato2 = new Gato("Frajola", 5);

        Golden golden = new Golden("Bob", 3);

        cadastro.adicionarAnimal(animal);
        cadastro.adicionarAnimal(cachorro);
        cadastro.adicionarAnimal(gato1);
        cadastro.adicionarAnimal(gato2);
        cadastro.adicionarAnimal(golden);

        System.out.println("ANIMAIS CADASTRADOS");
        cadastro.listarAnimais();

        System.out.println("\nTODOS EMITINDO SOM");
        cadastro.todosEmitiremSom();

        System.out.println("\nGATOS ENCONTRADOS");

        ArrayList<Gato> gatos = cadastro.buscarGatos();

        for (Gato gato : gatos) {
            System.out.println(gato);
        }

        System.out.println("\nRAÇA DOS CACHORROS");

        System.out.println(
            cachorro.getNome() + ": " + cachorro.getRaca()
        );

        System.out.println(
            golden.getNome() + ": " + golden.getRaca()
        );
    }
}
