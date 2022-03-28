package vtb.geekbrains.animals;

public class Dog extends Animal{
    int runLength = 500;
    int swimLength = 50;
    private String name ;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String run(int i) {
        if (i <= runLength) return this.name + " пробежал " + i + "м";
        else return this.name + " пробежал " + runLength + "м и Устал";
    }

    @Override
    public String swim(int i) {
        if (i <= swimLength) return this.name + " проплыл " + i + "м";
        else return this.name + " проплыл " + swimLength + "м и Устал";
    }
}
