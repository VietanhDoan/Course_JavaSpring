package lesson1.activity_16;

public class Activity16 {
    public static void main(String[] args) {
        new Thread(new MyThread("Thread 1")).start();
        new Thread(new MyThread("Thread 2")).start();
        new Thread(new MyThread("Thread 3")).start();
        new Thread(new MyThread("Thread 4")).start();
        new Thread(new MyThread("Thread 5")).start();
    }
}
