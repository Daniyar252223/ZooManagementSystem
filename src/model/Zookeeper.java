package model;

public class Zookeeper {
    private String name;
    private int experienceYears;
    private double salary;

    public Zookeeper(String name, int experienceYears, double salary) {
        this.name = name;
        this.experienceYears = experienceYears;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public double getSalary() {
        return salary;
    }

    public void feedAnimal(Animal animal) {
        System.out.println(name + " feeds " + animal.getName());
    }

    @Override
    public String toString() {
        return name + " (experience=" + experienceYears + ", salary=" + salary + ")";
    }

}

