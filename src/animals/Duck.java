package animals;


public class Duck extends Herbivore implements Fly,Voice{


    public Duck(String animalName, int animalSize) {
        super(animalName, animalSize);
    }

    @Override
    public void fly() {
        System.out.println("Утка полетела");
    }

    @Override
    public String voice() {
        return "КРЯЯЯЯ";
    }


}
