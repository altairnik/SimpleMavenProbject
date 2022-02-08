package SimpleAnimals;

public class Dog extends Animals{
    public Dog(String name, String type, String activity, String habitat, int weight, int age) {
        super(name, type, activity, habitat, weight, age);
        System.out.println("New dog was born!");
    }

    @Override
    public String makeSound() {

        return "Dog says rah rah";
    }

    @Override
    public void eat() {
        System.out.println("I like bones");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep in a dog kennel");
    }
}
