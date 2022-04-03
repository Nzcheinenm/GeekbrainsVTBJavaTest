package vtb.geekbrains.test2;

public class JumpStand implements Obstacle{
    int length;

    public JumpStand(int length) {
        this.length=length;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public void doIt(Action act) {
        act.jump(this.length);
    }
}
