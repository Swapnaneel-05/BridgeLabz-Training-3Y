package BridgeLabz.OOPSJava.Inheritance;

public class AnimalMain {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Whiskers", 2);
        Animal bird = new Bird("Tweety", 1);

        dog.showDetails();
        dog.makeSound();

        cat.showDetails();
        cat.makeSound();

        bird.showDetails();
        bird.makeSound();
        
    }
}
