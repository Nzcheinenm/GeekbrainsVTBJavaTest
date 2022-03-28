package vtb.geekbrains.animals;

public class Cat extends Animal{
    int runLength = 200;


    @Override
    public String run(int i) {
        if (i <= runLength) return "Котик пробежал " + i + "м";
        else return "Котик пробежал " + runLength + "м и Устал";
    }

    @Override
    public String swim(int i) {
        return "Котик не умеет плавать";
    }
}
