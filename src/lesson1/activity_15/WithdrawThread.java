package lesson1.activity_15;

public class WithdrawThread extends Thread {

    String threadName;
    final BankAccount bankAccount;
    int withdrawAmount;

    public WithdrawThread(String threadName, BankAccount bankAccount, int withdrawAmount) {
        this.threadName = threadName;
        this.bankAccount = bankAccount;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void run() {
        try {
            synchronized (bankAccount) {
                BankAccount.withDraw(threadName, withdrawAmount, bankAccount);;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
