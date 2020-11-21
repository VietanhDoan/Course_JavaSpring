package lesson1.activity_14;

import java.util.*;
import java.util.concurrent.BlockingQueue;

public class ThreadEnglish implements  Runnable {

    private final BlockingQueue<String> message;

    public ThreadEnglish(BlockingQueue<String> message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Map<String, String> dayOfWeeks = Activity14.getListDaysOfWeeks();

                Random random = new Random();
                Object[] values = dayOfWeeks.keySet().toArray();
                String randomDayEnglish = (String) values[random.nextInt(values.length)];

                message.put(randomDayEnglish);
                System.out.println(randomDayEnglish);
                Thread.sleep(1000);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
