package animals;


public class Horse extends Herbivore implements Voice,Run{


    public Horse(String animalName, int animalSize) {
        super(animalName, animalSize);
    }

    @Override
    public void run() {
        System.out.println("Лошадь бегает");
    }

    @Override
    public String voice() {
        return "ИГОГОГОГО";
    }
}
