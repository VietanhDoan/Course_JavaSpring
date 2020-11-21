package lesson1.activity_15;

class BankAccount {
    long balance;

    public BankAccount(long balance) {
        this.balance = balance;
    }

    static BankAccount withDraw(String threadName, long withdrawAmount, BankAccount bankAccount) {

        System.out.println(threadName + " need: " + withdrawAmount);
        if (withdrawAmount > bankAccount.balance) {
            System.out.println(threadName + " withdraw error!");
        } else {
            System.out.println(threadName + " withdraw success: " + withdrawAmount);
            bankAccount.balance -= withdrawAmount;
            System.out.println(threadName + " see balance: " + bankAccount.balance);
        }

        return bankAccount;
    }
}
