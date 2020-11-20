package lesson1.activity_11;

class ThreadActivity11 implements Runnable {
    @Override
    public void run() {
        System.out.println("Current Thread Name- " + Thread.currentThread().getName());
    }
}
