package multithreading;

public class BankAccount {
    int balance = 100;

    public BankAccount(int balance){
        this.balance = balance;
    }

    public synchronized void withdraw (int amount){
        if(balance >= amount ){
            try {


                    Thread.sleep(100);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
        }
        System.out.println("Balance:" + balance);
    }
}
