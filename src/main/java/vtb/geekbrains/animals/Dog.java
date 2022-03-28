package vtb.geekbrains.animals;

public class Dog extends Animal{
    int runLength = 500;
    int swimLength = 50;


    @Override
    public String run(int i) {
        if (i <= runLength) return "Бобик пробежал " + i + "м";
        else return "Бобик пробежал " + runLength + "м и Устал";
    }

    @Override
    public String swim(int i) {
        if (i <= swimLength) return "Бобик проплыл " + i + "м";
        else return "Бобик проплыл " + swimLength + "м и Устал";
    }
}
