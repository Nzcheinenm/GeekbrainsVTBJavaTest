package vtb.geekbrains;

//import vtb.geekbrains.animals.Cat;

import vtb.geekbrains.test6.Threads;
import vtb.geekbrains.test7.*;

import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.stream.Collectors;

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

    /*
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
     */

    /*
    //Homework 5
    public static void main(String[] args) {
        String[] str = new String[]{
                "AAA","BBB","AAA","CCC","AAA","DDD","BBB","HHH","PPP","EEE","TTT","AAA","PPP","MMM"
        };

        System.out.println(Task1.getListUnique(str));

        ///////

        PhoneList phList = new PhoneList("89009009090","Петров");
        phList.add("89199009090","Иванов");
        phList.add("89299009090","Васильев");
        phList.add("89399009090","Петров");
        phList.add("89499009090","Себастьян");
        phList.add("89099009090","Крудюк");

        phList.get("Петров");

    }
     */

    /*
    //HomeWork 6
    public static void main(String[] args) {
        Threads threads = new Threads();
        threads.nothingThreads();
        threads.existThreads();
    }
     */

    /*
    //HomeWork 7
    public static final int CARS_COUNT = 4;

    public static void main(String[] args) {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }

        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }
    }
     */

    //HomeWork 8
    public static class Consumer {
        String name;
        int age;
        int pay;

        Consumer(String name,int age,int pay) {
            this.age = age;
            this.name = name;
            this.pay = pay;
        }
    }
    public static void main(String[] args) {
        List<String> listCheck = new ArrayList<>();
        List<String> list = new ArrayList<>(Arrays.asList("A","BB","CCC","BB","A","BB","D","DEER","DEER"));
        System.out.println(Arrays.toString(list.stream().sorted((s1, s2) -> {
                    return s1.compareTo(s2);
                }).toArray()));


        //2
        Consumer cons1 = new Consumer("Иван",20,300);
        Consumer cons2 = new Consumer("Коля",60,200);
        Consumer cons3 = new Consumer("Себас",50,300);
        Consumer cons4 = new Consumer("Петя",20,400);

        List<Consumer> consumers = new ArrayList<>();
        consumers.add(cons1);
        consumers.add(cons2);
        consumers.add(cons3);
        consumers.add(cons4);

        System.out.println(consumers.stream().mapToInt(x -> x.pay).sum());
        //3
        oldConsumers(consumers,2);
    }
    //3
    public static void oldConsumers(List<Consumer> consumers, int n) {
        System.out.println("Самых старших сотрудников " + n + "x зовут:");
        List<Consumer> list = consumers.stream().sorted((x,y)-> y.age - x.age).collect(Collectors.toList());
        for (int i = 0; i <n; i++ ) {
            System.out.println("Сотрудник " + list.get(i).name + " в возрасте " + list.get(i).age);
        }
    }


}
