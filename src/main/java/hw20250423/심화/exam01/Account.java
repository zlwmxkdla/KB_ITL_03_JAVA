package hw20250423.심화.exam01;

public class Account {
    private long balance;

    public Account() {}
    public long getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }
    public void withdraw(int amount)throws InsufficientException {
        if(amount > balance){
            throw new InsufficientException("잔고 부족 " );
        }else if(amount < balance){
            balance -= amount;
        }
    }
}
