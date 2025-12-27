package model;

public class Zoo {
    private String zooName;
    private String location;
    private int animalsCount;
    private Animal firstAnimal;
    private Animal secondAnimal;

    public Zoo(String zooName, String location, int animalsCount) {
        this.zooName = zooName;
        this.location = location;
        this.animalsCount = animalsCount;
    }

    public void addAnimals(Animal a1, Animal a2) {
        firstAnimal = a1;
        secondAnimal = a2;
    }

    public void showHeavyAnimals(double minWeight) {
        if (firstAnimal.getWeight() > minWeight) {
            System.out.println(firstAnimal);
        }
        if (secondAnimal.getWeight() > minWeight) {
            System.out.println(secondAnimal);
        }
    }

    public void showOldestAnimals() {
        if (firstAnimal.getAge() > secondAnimal.getAge()) {
            System.out.println("Oldest: " + firstAnimal);
        } else {
            System.out.println("Oldest: " + secondAnimal);
        }
    }

    public void findAnimalByName(String name) {
        if (firstAnimal.getName().equals(name)) {
            System.out.println("Found: " + firstAnimal);
        }
        if (secondAnimal.getName().equals(name)) {
            System.out.println("Found: " + secondAnimal);
        }
    }

    @Override
    public String toString() {
        return zooName + " located in " + location;
    }
}
