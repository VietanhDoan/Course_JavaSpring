package lesson1.activity_13;

import java.util.concurrent.BlockingQueue;

class ThreadLeapYear extends Thread {

    private final BlockingQueue<Integer> message;

    public ThreadLeapYear(BlockingQueue<Integer> message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Integer year = message.take();
                boolean isLeapYear = checkLeapYear(year);

                if (isLeapYear) {
                    System.out.println(year + " is a leap year");
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private boolean checkLeapYear(Integer year) {
        boolean leap;

        if (year % 4 == 0) {
            if( year % 100 == 0) {
                leap = year % 400 == 0;
            } else leap = true;
        } else leap = false;

        return leap;
    }
}
