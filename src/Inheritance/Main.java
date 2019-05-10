package Inheritance;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Golden", 10, 60, 2, 4, 1, 20, "long");
        dog.eat();
        dog.walk();
        dog.run();

        Fish fish = new Fish("Nemo", 3, 2, 8, 2, 4);

        fish.eat();
        fish.swim(22);
        fish.rest();

    }
}
