package lesson1.activity_16;

import java.time.LocalTime;

public class MyThread implements Runnable {

    String name;

    public MyThread(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        int startNumber = 1;
        int endNumber = 100000;
        try {
            while (true) {
                System.out.println(this.name + " start: " + LocalTime.now());
                findNumberMostDivisors(startNumber, endNumber);
                System.out.println(this.name + " end: " + LocalTime.now());
                Thread.sleep(5000);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void findNumberMostDivisors(int startNumber, int endNumber) {
        int numberMostDivisors = startNumber;
        int amountDivisors = 0;

        for (int number = startNumber; number <= endNumber; number++) {
            if (amountDivisors < getAmountDivisors(number)) {
                numberMostDivisors = number;
                amountDivisors = getAmountDivisors(number);
            }
        }
        System.out.println("Number with most divisors " + numberMostDivisors + " - amount of divisors: " + amountDivisors);
    }

    private int getAmountDivisors(int number) {
        int counter = 0;
        for (int i = 1 ; i <= number ; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        return counter;
    }
}
