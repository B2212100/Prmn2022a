package lecture04;

public class Account {
    private String name;
    private String number;
    private long balance;

    public Account(String name, String number) {
        this.name = name;
        this.number = number;
        this.balance = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    public void setSumBalance(long money) {
        this.balance += money;
        return;
    }

    public void setDifBalance(long money) {
        this.balance -= money;
        return;
    }

    public long getBalance() {
        return this.balance;
    }
}
