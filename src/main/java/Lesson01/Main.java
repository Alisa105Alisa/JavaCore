package Lesson01;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", "black", 1);

        System.out.println(cat);
        Cat cat1 = new Cat("Морис", "black", 1);
        Cat cat2 = new Cat("Морис", "black", 1);
        System.out.println(cat1.equals(cat2));

        Cat cat3 = new Cat("Морис", "black", 2);

        System.out.println(cat2.hashCode());
        System.out.println(cat3.hashCode());

        Wolf wolf = new Wolf("Тревор", "Серый", 6);
        Animal cat4 = new Cat("Морис", "Рыжий", 10);
        if (cat4 instanceof Wolf) {
            Wolf cat5 = (Wolf) cat4;
        } else {
            System.out.println("Не является волком!");
        }
        System.out.println(wolf);

        Cat cat5 = new Cat("Барсик", "white", 2);
        cat5.setAge(3);


    }
}
