package vtb.geekbrains.test2;

public class Human implements Action{

    private int lengthJump;
    private int lengthRun;
    private String name;

    private boolean isComplete = true;

    public Human(String name, int lengthJump, int lengthRun) {
        this.name=name;
        this.lengthJump=lengthJump;
        this.lengthRun=lengthRun;
    }


    @Override
    public void jump(int length) {
        if (length > lengthJump) {
            System.out.println(name + " не смог прыгнуть на такую высоту");
            isComplete = false;
        } else {
            System.out.println(name + " прыгнул на высоту " + length + "см");
        }
    }

    @Override
    public void run(int length) {
        if (length > lengthRun) {
            System.out.println(name + " не смог пробежать на такую дистанцию");
            isComplete = false;
        } else {
            System.out.println(name + " пробежал " + length + "м");
        }
    }

    @Override
    public boolean getIsComplete() {
        return this.isComplete;
    }

}
