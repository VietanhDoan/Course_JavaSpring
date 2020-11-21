package lesson1.activity_15;

import java.util.concurrent.BlockingQueue;

public class WithdrawThread extends Thread {

    String threadName;
    BlockingQueue<BankAccount> bankAccount;
    int withdrawAmount;

    public WithdrawThread(String threadName, BlockingQueue<BankAccount> bankAccount, int withdrawAmount) {
        this.threadName = threadName;
        this.bankAccount = bankAccount;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void run() {
        try {
//            synchronized () {
//
//            }
            BankAccount account;
            if (bankAccount.size() == 0) {
                account = BankAccount.withDraw(threadName, withdrawAmount, new BankAccount(20000000));
            } else {
                account = BankAccount.withDraw(threadName, withdrawAmount, bankAccount.take());
            }
            bankAccount.put(account);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
