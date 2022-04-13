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

        new Thread(){
            @Override
            public void run() {
                Arrays.fill(arr2,0,HALF,1);
                System.arraycopy(arr2,0,arr,0,HALF);
                System.out.println(System.currentTimeMillis() - a);
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                Arrays.fill(arr1,0,HALF,1);
                System.arraycopy(arr1,0,arr,HALF,HALF);
                System.out.println(System.currentTimeMillis() - a);
            }
        }.start();

        new Thread(){
            @Override
            public void run() {

                System.arraycopy(arr,HALF,arr2,0,HALF);
                for (int i = 0; i < SIZE; i++) {
                    arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                            Math.cos(0.4f + i / 2));
                }
                System.arraycopy(arr2,0,arr,arr2.length,HALF);
                System.out.println(System.currentTimeMillis() - a);
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                System.arraycopy(arr,0,arr1,0,HALF);
                for (int i = 0; i < SIZE; i++) {
                    arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                            Math.cos(0.4f + i / 2));
                }
                System.arraycopy(arr1,0,arr,arr1.length,HALF);
                System.out.println(System.currentTimeMillis() - a);
            }
        }.start();


    }
}

