
    import java.util.ArrayList;

    public class Zookeeper {
        private ArrayList<Animal> animalList = new ArrayList<>();

        public void addAnimal(Animal animal) {
            animalList.add(animal);
        }

        public void displayAnimals() {
            if (animalList.isEmpty()) {
                System.out.println("No animals in the zoo.");
            } else {
                for (Animal animal : animalList) {
                    System.out.println(animal);
                }
            }
        }

        public void removeAnimal(String name) {
            animalList.removeIf(animal -> animal.getName().equalsIgnoreCase(name));
        }
    }
}
