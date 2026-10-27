package koda;

public class Employee {
    private String account;
    private String owner;
    private double balance;

    public String getAccount() {
        return account;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public Employee(String account, String owner, double balance) {
        if (account == null || account.isBlank()) {
            throw new IllegalArgumentException("Account number wajib diisi");
        }
        if (owner == null || owner.isBlank()) {
            throw new IllegalArgumentException("Owner wajib diisi");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Balance wajib diisi");
        }
        this.account = account;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0 || !Double.isFinite(amount)) {
            throw new IllegalArgumentException("Deposit harus positif");
        }
        balance += amount;
    }
}
