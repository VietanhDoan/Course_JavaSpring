package lesson1.activity_14;

import java.util.Map;
import java.util.concurrent.BlockingQueue;

public class ThreadVietnamese implements Runnable {

    private final BlockingQueue<String> message;

    public ThreadVietnamese(BlockingQueue<String> message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Map<String, String> dayOfWeeks = Activity14.getListDaysOfWeeks();
                String randomDayEnglish = message.take();
                String randomDayVietnamese = dayOfWeeks.get(randomDayEnglish);
                System.out.println(randomDayVietnamese);
                System.out.println();
                Thread.sleep(1000);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
