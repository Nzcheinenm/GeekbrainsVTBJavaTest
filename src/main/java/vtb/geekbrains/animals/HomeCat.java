package vtb.geekbrains.animals;

public class HomeCat extends Animal{
    int runLength = 20;


    @Override
    public String run(int i) {
        if (i <= runLength) return "Рыжик пробежал " + i + "м";
        else return "Рыжик пробежал " + runLength + "м и Устал";
    }

    @Override
    public String swim(int i) {
        return "Рыжик не умеет плавать";
    }
}
