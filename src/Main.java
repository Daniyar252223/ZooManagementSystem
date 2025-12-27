import model.Animal;
import model.Lion;
import model.Tiger;
import model.Zoo;
import model.Zookeeper;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Animal lion = new Lion("Mufasa", 5, 190.5);
        Animal tiger = new Tiger("Sherkhan", 3, 160.0);

        Zookeeper keeper1 = new Zookeeper("Ali", 7, 350000);
        Zookeeper keeper2 = new Zookeeper("Dana", 3, 220000);

        Zoo zoo = new Zoo("Almaty Zoo", "Almaty", 120);
        zoo.addAnimals(lion, tiger);

        System.out.println(lion);
        System.out.println(tiger);
        System.out.println(keeper1);
        System.out.println(keeper2);
        System.out.println(zoo);

        zoo.showOldestAnimals();
        zoo.showHeavyAnimals(180);
        zoo.findAnimalByName("Sherkhan");
        keeper1.feedAnimal(lion);
        keeper2.feedAnimal(tiger);
        lion.makeSound();
        tiger.makeSound();

    }
}
