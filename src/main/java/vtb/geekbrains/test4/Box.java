package vtb.geekbrains.test4;

import java.util.ArrayList;

public class Box <T extends Fruit>{
    ArrayList<T> fruits = new ArrayList<>();
    private int weight;

    public Box() {

    }

    public Box(T fruit) {
        this.fruits.add(fruit);
    }

    public void addFruit(T fruit) {
        this.fruits.add(fruit);
    }

    public int getWeight() {
        for (T fruit: fruits) {
            weight += fruit.getMass();
        }
        return weight;
    }

    public boolean compare(Box box) {
        return box.getWeight() == this.weight;
    }

    public void empty(Box<T> box2) {

        for (T fruit: fruits) {
            box2.addFruit(fruit);
        }

        fruits.clear();
    }

}
