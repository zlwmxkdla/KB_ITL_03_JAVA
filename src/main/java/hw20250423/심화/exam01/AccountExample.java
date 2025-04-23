package hw20250423.심화.exam01;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        System.out.println("예금액: " + account.getBalance());
        try{
            account.withdraw(5000);

        }catch(InsufficientException e){
            System.out.println(e.getMessage());
        }
        try{
            account.withdraw(7000);

        }catch(InsufficientException e){
            System.out.println(e.getMessage());
        }
    }
}
