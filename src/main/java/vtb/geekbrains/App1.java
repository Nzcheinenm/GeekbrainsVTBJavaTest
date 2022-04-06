package vtb.geekbrains;

//import vtb.geekbrains.animals.Cat;

import vtb.geekbrains.test4.Apple;
import vtb.geekbrains.test4.Box;
import vtb.geekbrains.test4.Task1;

public class App1 {

    //public static void main(String[] args) {

        /* HomeWork1
        public static void main(String[] args) {
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

    }
        */



        /*
        //HomeWork 2
        public static void main(String[] args) {
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
         */

    /*
    //HomeWork 3
    public static void main(String[] args) {

        String[][] arr1 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] arr2 = {
                {"1", "2", "A", "4"},
                {"1", "c", "3", "4"},
                {"1", "2", "Sd", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] arr3 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        try {
            getArray(arr1);
        } catch (MyArraySizeException e) {
            System.out.println(e);
        } finally {
            try {
                getArray(arr2);
            } catch (MyArrayDataException e) {
                System.out.println(e);
            } finally {
                try {
                    getArray(arr3);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

    public static void getArray(String[][] arr) throws MyArrayDataException {
        System.out.println(arr.length);
        if (arr.length != 4) {
            throw new MyArraySizeException(arr.length);
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    count += Integer.valueOf(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println(count);
    }
     */


    //Homework 4
    public static void main(String[] args) {
        Task1<Integer> task1 = new Task1<>();
        Integer[] integerArr = new Integer[]{1,2,3,4};
        task1.swapArray(integerArr,1,2);
        task1.toArrayList(integerArr).forEach(System.out::print);

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        System.out.println();

        Box<Apple> box = new Box<>(apple1);
        box.addFruit(apple2);
        box.addFruit(apple1);
        System.out.println(box.getWeight());

        Box<Apple> box2 = new Box<>();
        box2.addFruit(apple2);
        System.out.println(box.compare(box2));
        box.empty(box2);

        System.out.println(box2.getWeight());
    }
}
