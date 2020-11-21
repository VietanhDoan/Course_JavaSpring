package lesson1.activity_15;

public class Activity15 {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(20000000);
        WithdrawThread husbandThread = new WithdrawThread("Husband", bankAccount, 15000000);
        WithdrawThread wifeThread = new WithdrawThread("Wife", bankAccount, 20000000);

        husbandThread.start();
        wifeThread.start();
    }
}
