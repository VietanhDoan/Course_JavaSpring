package lesson1.activity_11;

import java.util.ArrayList;
import java.util.List;

public class Activity11 {
    public static void main(String[] args) {

        List<Thread> threadList = createMultipleThreads();
        int i = 0;
        while (i < threadList.size()) {
            threadList.get(i).start();
            i++;
        }
    }

    private static List<Thread> createMultipleThreads() {
        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Thread thread = new Thread(new ThreadActivity11(), "Thread " + (i + 1));
            list.add(thread);
        }
        return list;
    }
}

