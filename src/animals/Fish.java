package animals;


public class Fish extends Carnivorous implements Swim{
    public Fish(String animalName, int animalSize) {
        super(animalName, animalSize);
    }

    @Override
    public void swim() {
        System.out.println("Рыба плавает");
    }
}
