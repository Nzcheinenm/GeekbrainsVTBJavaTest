package vtb.geekbrains.test7;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {
    private static int CARS_COUNT;
    static Object obj;
    static boolean isWin;
    static {
        CARS_COUNT = 0;
        obj = new Object();
        isWin = true;
    }

    static CyclicBarrier cb;
    static CountDownLatch countDownLatch ;
    private Race race;
    private int speed;
    private String name;
    private static int isFirst = 0;


    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
        cb = new CyclicBarrier(CARS_COUNT);
        countDownLatch = new CountDownLatch(CARS_COUNT);
    }
    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            cb.await();
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            countDownLatch.countDown();
            if (countDownLatch.getCount() == 0) System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        synchronized (obj) {
            if(isWin) {
                isWin = false;
                System.out.println(this.name + " - WIN!!");
            }
        }
        isFirst++;
        if(isFirst == CARS_COUNT) System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }
}

