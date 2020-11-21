package lesson1.activity_13;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Activity13 {
    public static void main(String[] args) {
        BlockingQueue<Integer> messages = new ArrayBlockingQueue<>(1);
        ThreadGenerateNumber threadGenerateNumber = new ThreadGenerateNumber(messages);
        ThreadLeapYear threadLeapYear = new ThreadLeapYear(messages);
        threadGenerateNumber.start();
        threadLeapYear.start();
    }
}
