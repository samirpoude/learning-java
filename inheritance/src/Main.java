public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("generic animal", "huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("labrador retriever", 65, "floppy", "swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");
    }
    public static void doAnimalStuff(Animal animal, String speed){

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("------");
    }
}
