package animals;


public class Rabbit extends Herbivore implements Run,Voice{


    public Rabbit(String animalName, int animalSize) {
        super(animalName, animalSize);
    }

    @Override
    public void run() {
        System.out.println("Кролик бегает");
    }

    @Override
    public String voice() {
        return "Фр фр фр фр";
    }
}
