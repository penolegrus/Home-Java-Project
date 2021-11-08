package animals;

public class Cheetah extends Carnivorous implements Run,Voice{


    public Cheetah(String animalName, int animalSize) {
        super(animalName, animalSize);
    }

    @Override
    public void run() {
        System.out.println("Гепард побежал");
    }

    @Override
    public String voice() {
        return "МЯУ";
    }
}
