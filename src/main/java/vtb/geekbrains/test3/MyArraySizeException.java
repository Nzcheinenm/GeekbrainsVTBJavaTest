package vtb.geekbrains.test3;

public class MyArraySizeException extends IndexOutOfBoundsException{
    private int length;
    public MyArraySizeException(int length) {
        super("Массив не соответствует описанию. Длина данного массива - " + length + ". А ожидается 4*");
        this.length = length;
    }
}
