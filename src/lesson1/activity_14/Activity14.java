package lesson1.activity_14;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Activity14 {
    public static void main(String[] args) {
        BlockingQueue<String> messages = new ArrayBlockingQueue<>(1);
        ThreadEnglish threadEnglish = new ThreadEnglish(messages);
        ThreadVietnamese threadVietnamese = new ThreadVietnamese(messages);
        new Thread(threadEnglish).start();
        new Thread(threadVietnamese).start();
    }

    static Map<String, String> getListDaysOfWeeks() {
        Map<String, String> result = new HashMap<>();;
        result.put("Monday", "Thứ 2");
        result.put("Tuesday", "Thứ 3");
        result.put("Wednesday", "Thứ 4");
        result.put("Thursday", "Thứ 5");
        result.put("Friday", "Thứ 6");
        result.put("Saturday", "Thứ 7");
        result.put("Sunday", "Chủ nhật");
        return result;
    }
}
