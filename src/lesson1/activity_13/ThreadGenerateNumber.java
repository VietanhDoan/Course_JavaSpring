package lesson1.activity_13;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

class ThreadGenerateNumber extends Thread {

    private final BlockingQueue<Integer> message;

    public ThreadGenerateNumber(BlockingQueue<Integer> message) {
        this.message = message;
    }

    @Override
    public void run() {
        int min = 1000;
        int max = 9999;

        try {
            do {
                Integer generateNumber = generateRandomNumber(min, max);
                message.put(generateNumber);
                Thread.sleep(2000);
            } while (true);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private Integer generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
