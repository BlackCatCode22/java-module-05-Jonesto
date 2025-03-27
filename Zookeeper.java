import java.util.ArrayList;
import java.util.List;


public class Zookeeper {
    private List<Animal> animalList = new ArrayList<>();


    public void addAnimal(Animal animal) {
        if (animal != null) {
            animalList.add(animal);
        } else {
            System.out.println("Cannot add null animal.");
        }
    }


    public void displayAnimals() {
        if (animalList.isEmpty()) {
            System.out.println("No animals in the zoo.");
        } else {
            animalList.forEach(System.out::println);
        }
    }


    public boolean removeAnimal(String name) {
        return animalList.removeIf(animal -> animal.getName().equalsIgnoreCase(name));
    }
}
