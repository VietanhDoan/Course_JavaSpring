package lesson1.activity_12;

class MyThread extends Thread {

    String name;
    int sleep;

    public MyThread(String name, int sleep) {
        this.name = name;
        this.sleep = sleep;
    }

    public void run() {
        this.setName(name);
        while (true) {
            try {
                System.out.println(name);
                Thread.sleep(sleep);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
}

