package aviary;

import animals.Animal;

import java.util.HashMap;
import java.util.Map;

public class Aviary <T extends Animal>{

    private AviarySize aviarySize;

    public Aviary(AviarySize aviarySize) {
        this.aviarySize = aviarySize;
    }

    private Map<String, Animal> animalMap = new HashMap<>();

    public void addAnimal(T animal) throws WrongAviaryException {
        if (animalMap.containsKey(animal.getAnimalName())) {
            throw new WrongAviaryException("Животное с именем " + animal.getAnimalName() + " уже существует");
        }
        if (animal.getAnimalSize() > aviarySize.getSize()){
            System.out.println("Животное с именем " + animal.getAnimalName() + " не подходит для этого вольера");
        } else {
            animalMap.put(animal.getAnimalName(), animal);
            System.out.println(animal.getAnimalName() + " добавлен в вольер");
        }
    }

    public void removeAnimal(T animal) {
        animalMap.remove(animal.getAnimalName());
        System.out.println(animal.getAnimalName() + " убран из вольера");

    }

    public T getLinkOnAnimalInAviary(String animalName) throws WrongAviaryException {
        if (!animalMap.containsKey(animalName)) {
            throw new WrongAviaryException("Такого животного с именем " + animalName + " в вольере нет");
        }
        return (T) animalMap.get(animalName);
    }

}
