package animals;

import food.Food;
import food.WrongFoodException;

import java.util.Objects;

public abstract class Animal {
    protected int satiety;
    protected String animalName;
    protected int animalSize;

    public Animal(String animalName, int animalSize) {
        this.animalName = animalName;
        this.animalSize = animalSize;
    }

    public abstract void eat(Food food) throws WrongFoodException;

    public String getAnimalName() {
        return animalName;
    }

    public int getAnimalSize() {
        return animalSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return getAnimalName().equals(animal.getAnimalName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAnimalName());
    }
}
