package lesson1.activity_12;

public class Activity12 {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("ABC", 3500);
        MyThread myThread2 = new MyThread("DEF", 2500);
//        myThread1.setName("ABC");
//        myThread2.setName("DEF");
        myThread1.start();
        myThread2.start();
    }
}

