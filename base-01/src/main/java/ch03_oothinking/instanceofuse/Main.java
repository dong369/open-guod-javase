package ch03_oothinking.instanceofuse;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        info(animal);
        info(dog);
        info(cat);
    }

    private static void info(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.go();
        }
    }
}
