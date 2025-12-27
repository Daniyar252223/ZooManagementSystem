package model;

public class Tiger extends Animal {
    public Tiger(String name, int age, double weight) {
        super(name, "Tiger", age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " growls");
    }
}
