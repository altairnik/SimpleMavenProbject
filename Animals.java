package SimpleAnimals;

import java.util.Objects;

public abstract class Animals {
    private String name;
    String type;
    String activity;
    String habitat;
    int weight;
    int age;

    public  Animals(String name, String type, String activity, String habitat, int weight, int age){
        //System.out.println("Animal creator");
        this.name = name;
        this.type = type;
        this.activity = activity;
        this.habitat = habitat;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return weight == animals.weight && age == animals.age && name.equals(animals.name) && type.equals(animals.type) && activity.equals(animals.activity) && habitat.equals(animals.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, activity, habitat, weight, age);
    }

    public abstract String makeSound();
    public abstract void eat();
    public abstract void sleep();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age;
    }
}
