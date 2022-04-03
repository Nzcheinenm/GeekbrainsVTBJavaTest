package vtb.geekbrains.test2;

public class RunSpace implements Obstacle{
    private int length;

    public RunSpace(int length) {
        this.length = length;
    }

    @Override
    public int getLength() {
        return length;
    }
    @Override
    public void doIt(Action act) {
        act.run(this.length);
    }
}
