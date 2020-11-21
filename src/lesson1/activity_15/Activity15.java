package lesson1.activity_15;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Activity15 {

    public static void main(String[] args) {

        BlockingQueue<BankAccount> bankAccount = new ArrayBlockingQueue<>(1);

        WithdrawThread husbandThread = new WithdrawThread("Husband", bankAccount, 15000000);
        husbandThread.start();

        WithdrawThread wifeThread = new WithdrawThread("Wife", bankAccount, 20000000);
        wifeThread.start();
    }
}
