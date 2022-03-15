import java.awt.*;

public class Runner {
    public static void main(String[] args)
    {
        Animal animal = new Animal("Animal", 16, true, false);
        System.out.println(animal.getAge());
        System.out.println(animal.getName());
        System.out.println(animal.isVaccinated());
        System.out.println(animal.isHungry());

        animal.adopt();
        animal.feed();
        animal.starve();

        System.out.println("---------------");

        Dog dog = new Dog("Gooey", 8, true, true, true, false);
        System.out.println(dog.getAge());
        System.out.println(dog.getName());
        System.out.println(dog.isVaccinated());
        System.out.println(dog.isHungry());
        System.out.println(dog.hasBeenWalked());
        System.out.println(dog.isSitting());

        dog.adopt();
        dog.feed();
        dog.starve();
        dog.walk();
        dog.sit();

        System.out.println("---------------");

        Cat cat = new Cat("Nago", 4, true, false, false, true);
        System.out.println(cat.getAge());
        System.out.println(cat.getName());
        System.out.println(cat.isVaccinated());
        System.out.println(cat.isHungry());
        System.out.println(cat.hasPlayedWith());
        System.out.println(cat.isItchy());

        cat.adopt();
        cat.feed();
        cat.starve();
        cat.play();
        cat.scratch();
    }
}