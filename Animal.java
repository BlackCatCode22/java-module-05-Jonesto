public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();
        Animal animal1 = new Animal("Lion");
        Animal animal2 = new Animal("Tiger");

        zookeeper.addAnimal(animal1);
        zookeeper.addAnimal(animal2);

        zookeeper.displayAnimals();

        zookeeper.removeAnimal("Lion");

        zookeeper.displayAnimals();
    }
}
