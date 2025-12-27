package model;

public class Lion extends Animal {
    public Lion(String name, int age, double weight) {
        super(name, "Lion", age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " roars");
    }
}
