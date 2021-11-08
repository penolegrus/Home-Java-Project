import animals.Animal;
import animals.Swim;
import animals.Voice;
import food.Food;
import food.WrongFoodException;

public class Worker {

    public void feed(Animal animal, Food food) throws WrongFoodException {
       animal.eat(food);
    }

    public void getVoice(Voice animal) {
        if(animal instanceof Swim) {
            System.out.println("Рыба не издает зуки в воде!");
        }
        System.out.println(animal.voice());
    }
}
