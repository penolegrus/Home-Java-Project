package animals;


public class Wolf extends Carnivorous implements Voice,Run{


    public Wolf(String animalName, int animalSize) {
        super(animalName, animalSize);
    }

    @Override
    public void run() {
        System.out.println("Волк бегает");
    }

    @Override
    public String voice() {
        return "ВУФ ВУФ АУФФФФ";
    }
}
