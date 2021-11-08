import animals.*;
import aviary.Aviary;
import aviary.AviarySize;
import aviary.WrongAviaryException;
import food.Beef;
import food.Salad;
import food.WrongFoodException;


public class Zoo{
    public static void main(String[] args) throws WrongAviaryException, WrongFoodException {
        Duck duck = new Duck("Утка",3);
        Beef beef = new Beef();
        Salad salad = new Salad();
        Worker worker = new Worker();
        worker.getVoice(duck);
        worker.feed(duck,beef);

        Carnivorous wolf2 = new Wolf("Хищный волк",5);
        Aviary<Carnivorous> carnivorousAviary = new Aviary<>(AviarySize.HUGE);
        carnivorousAviary.addAnimal(wolf2);
        carnivorousAviary.removeAnimal(wolf2);
        carnivorousAviary.getLinkOnAnimalInAviary("Хищный волк");

        Herbivore duck2 = new Duck("Травоядная утка", 3);
        Aviary<Herbivore> herbivoreAviary = new Aviary<>(AviarySize.SMALL);
        herbivoreAviary.addAnimal(duck2);
    }

}
