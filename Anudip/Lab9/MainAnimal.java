class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Dog {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class MainAnimal {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();

        a.makeSound();
        d.makeSound();
        c.makeSound();
    }
}
