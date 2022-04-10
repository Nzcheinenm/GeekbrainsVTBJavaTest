package vtb.geekbrains.test5;

import java.util.*;

public class Task1 {

    public static List getListUnique (String[] arrayString)  {
        List<String> list = new ArrayList();
        Map<String,Integer> mapCount = new HashMap<>();
        boolean isDublicate = false;
        int count = 1;

        for (int i = 0; i < arrayString.length; i++) {
            for (int j = 0; j < arrayString.length; j++) {
                if (i != j) {
                    if (arrayString[i].equals(arrayString[j])) {
                        isDublicate = true;
                        count++;
                    }
                }
            }

            if (isDublicate) {
                mapCount.put(arrayString[i],count);
            }

            if (!isDublicate) list.add(arrayString[i]);
            isDublicate = false;
            count = 1;
        }
        mapCount.forEach((s,i) -> System.out.println(s + " , встречается - "+ i + " раз."));
        return list;
    }
}
