package vtb.geekbrains;

import vtb.geekbrains.animals.Animal;
import vtb.geekbrains.animals.Cat;
import vtb.geekbrains.animals.Dog;
import vtb.geekbrains.animals.HomeCat;

import java.util.ArrayList;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        Dog dog = new Dog();
        HomeCat homeCat = new HomeCat();

        int countCat = 0;
        int countDog = 0;
        int countHomeCat = 0;

        List<Animal> list = new ArrayList<>();

        list.add(cat);
        list.add(dog);
        list.add(cat2);
        list.add(homeCat);

        for (Animal an: list) {
            System.out.println(an.run(100));
            System.out.println(an.swim(100));
            System.out.println("");
            if (an instanceof Cat) countCat++;
            if (an instanceof Dog) countDog++;
            if (an instanceof HomeCat) countHomeCat++;
        }

        System.out.println("Всего в массиве Котов - " + countCat);
        System.out.println("Всего в массиве Собак - " + countDog);
        System.out.println("Всего в массиве Домашних Котов - " + countHomeCat);

    }
}
