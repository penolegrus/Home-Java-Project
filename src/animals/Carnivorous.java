package animals;

import food.Food;
import food.Meat;
import food.WrongFoodException;

//хищное животное
public class Carnivorous extends Animal{

    public Carnivorous(String animalName, int animalSize) {
        super(animalName, animalSize);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            satiety = satiety + food.getFoodValue();
            System.out.println("Ура, мне дали поесть мясо. Мой уровень сытости: " + satiety);
        } else {
            throw new WrongFoodException("Это животное не ест траву");
        }
    }
}
