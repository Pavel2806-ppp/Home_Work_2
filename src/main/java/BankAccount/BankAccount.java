package BankAccount;

public class BankAccount {
    private static int accountNumber = 0;
    private double balance;

    public BankAccount() {
        accountNumber++;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

//    public void setAccountNumber(int accountNumber) {
//        this.accountNumber = accountNumber;
//    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(double sumToAdd){
        setBalance(getBalance() + sumToAdd);
    }

    public void debit(double sumToWithdraw){
        if (getBalance() < sumToWithdraw) {
            System.out.println("Сумма снятия больше чем остаок на счету!");
        } else setBalance(getBalance() - sumToWithdraw);
    }
}