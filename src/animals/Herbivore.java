package animals;

import food.Food;
import food.Grass;
import food.WrongFoodException;

//травоядное животное
public class Herbivore extends Animal{


    public Herbivore(String animalName, int animalSize) {
        super(animalName, animalSize);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            System.out.println("Ура, мне дали поесть траву");
        } else {
            throw new WrongFoodException("Это животное не ест мясо");
        }
    }
}
