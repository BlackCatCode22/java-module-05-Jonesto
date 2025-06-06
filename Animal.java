
    public class Animal {
        private final String name;
        private final String species;
        private final int age;

        public Animal(String name, String species, int age) {
            this.name = name;
            this.species = species;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getSpecies() {
            return species;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return name + " the " + species + ", Age: " + age;
        }
    }

}

