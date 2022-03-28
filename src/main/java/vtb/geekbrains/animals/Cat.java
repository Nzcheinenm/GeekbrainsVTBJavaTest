package vtb.geekbrains.animals;

public class Cat extends Animal{
    int runLength = 200;
    private String name ;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String run(int i) {
        if (i <= runLength) return this.name + " пробежал " + i + "м";
        else return this.name + " пробежал " + runLength + "м и Устал";
    }

    @Override
    public String swim(int i) {
        return this.name + " не умеет плавать";
    }
}
