package vtb.geekbrains.test3;

public class MyArrayDataException extends NumberFormatException{
    private int row;
    private int column;
    private int value;

    public MyArrayDataException (int column,int row) {
        super("Неверное значение в ячейке - arr[" + column + "][" + row + "]");
        this.column = column;
        this.row = row;
    }
}
