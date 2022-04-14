package vtb.geekbrains.test6;

import java.util.Arrays;

public class Threads {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;
    float[] arr = new float[SIZE];
    long a;

    public void nothingThreads() {
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }
        a = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);

    }

    public void existThreads() {
        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];
        a = System.currentTimeMillis();
        Arrays.fill(arr2,0,HALF,1);
        Arrays.fill(arr1,0,HALF,1);

        System.arraycopy(arr2,0,arr,0,HALF);
        System.arraycopy(arr1,0,arr,HALF,HALF);

        Thread one = new Thread(){
            @Override
            public void run() {

                System.arraycopy(arr,HALF,arr2,0,HALF);
                for (int i = 0, j = HALF; i < SIZE; i++,j++) {
                    arr[i] = (float) (arr[i] * Math.sin(0.2f + (i + j) / 5) * Math.cos(0.2f + (i + j) / 5) *
                            Math.cos(0.4f + (i + j) / 2));
                }
            }
        };

        Thread two = new Thread(){
            @Override
            public void run() {
                System.arraycopy(arr,0,arr1,0,HALF);
                for (int i = 0,j = HALF; i < SIZE; i++,j++) {
                    arr[i] = (float)(arr[i] * Math.sin(0.2f + (i + j)/ 5) * Math.cos(0.2f + (i + j) / 5) *
                            Math.cos(0.4f + (i + j) / 2));
                }

            }
        };

        one.start();
        two.start();


        try {
            one.join();
            two.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(arr2,0,arr,arr2.length,HALF);
        System.out.println(System.currentTimeMillis() - a);

        System.arraycopy(arr1,0,arr,arr1.length,HALF);
        System.out.println(System.currentTimeMillis() - a);
    }
}

