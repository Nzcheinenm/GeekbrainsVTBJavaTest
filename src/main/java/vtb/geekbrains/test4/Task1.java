package vtb.geekbrains.test4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1<T> {

    public T[] swapArray(T[] array,int indexFirst, int indexSecond) {
        if (indexSecond <= array.length-1 && indexFirst >= 0) {
            T swap = array[indexFirst];
            array[indexFirst] = array[indexSecond];
            array[indexSecond] = swap;
            return array;
        } else {
            throw new NumberFormatException();
        }
    }

    public ArrayList<T> toArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

}
