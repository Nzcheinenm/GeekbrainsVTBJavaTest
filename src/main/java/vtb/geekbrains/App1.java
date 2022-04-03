package vtb.geekbrains;

//import vtb.geekbrains.animals.Cat;
import vtb.geekbrains.test2.*;

import java.util.ArrayList;
import java.util.List;

public class App1 {
    public static void main(String[] args) {

        /* HomeWork1
        Cat cat = new Cat("Барсик");
        Cat cat2 = new Cat("Рыжик");
        Dog dog = new Dog("Рекс");
        HomeCat homeCat = new HomeCat("Пушистик");

        List<Animal> list = new ArrayList<>();

        list.add(cat);
        list.add(dog);
        list.add(cat2);
        list.add(homeCat);

        for (Animal an: list) {
            System.out.println(an.run(100));
            System.out.println(an.swim(100));
            System.out.println("");
        }

        System.out.println("Всего в массиве Котов - " + Cat.count);
        System.out.println("Всего в массиве Собак - " + Dog.count);
        System.out.println("Всего в массиве Домашних Котов - " + HomeCat.count);
        */

        //HomeWork 2
        JumpStand jumpStand = new JumpStand(100);
        RunSpace runSpace = new RunSpace(100);
        JumpStand jumpStand2 = new JumpStand(200);
        RunSpace runSpace2 = new RunSpace(300);

        List<Obstacle> obs = new ArrayList<>();
        obs.add(jumpStand);
        obs.add(runSpace);
        obs.add(jumpStand2);
        obs.add(runSpace2);

        Human dime = new Human("Дима", 200,200);
        Cat meow = new Cat("Рыжик", 120,40);
        Cat meow2 = new Cat("Пушистик", 50,110);

        List<Action> actionList = new ArrayList<>();
        actionList.add(dime);
        actionList.add(meow);
        actionList.add(meow2);

        for (Obstacle obstacle: obs) {
            for (Action act: actionList) {
                if (act.getIsComplete())
                    obstacle.doIt(act);
            }
        }
    }
}
