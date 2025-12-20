import model.Animal;
import model.Zoo;
import model.Zookeeper;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Animal lion = new Animal("Mufasa", "Lion", 5, 190.5);
        Animal tiger = new Animal("Sherkhan", "Tiger", 3, 160.0);

        Zookeeper keeper1 = new Zookeeper("Ali", 7, 350000);
        Zookeeper keeper2 = new Zookeeper("Dana", 3, 220000);

        Zoo zoo = new Zoo("Almaty Zoo", "Almaty", 120);

        System.out.println(lion);
        System.out.println(tiger);
        System.out.println(keeper1);
        System.out.println(keeper2);
        System.out.println(zoo);

        if (lion.getAge() > tiger.getAge()) {
            System.out.println(lion.getName() + " is older than " + tiger.getName());
        }
        if (keeper1.getExperienceYears() > keeper2.getExperienceYears()) {
            System.out.println(keeper1.getName() + " has more experience than " + keeper2.getName());
        }

        keeper1.feedAnimal(lion);
        lion.makeSound();
    }
}
