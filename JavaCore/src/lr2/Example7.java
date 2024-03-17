package lr2;

public class Example7 {
    public interface BankAccount {
        void deposit(double amount);
        void withdraw(double amount);
        double getBalance();
    }

    public static class Account implements BankAccount {
        private double balance;

        public Account(double balance) {
            this.balance = balance;
        }

        @Override
        public void deposit(double amount) {
            balance += amount;
        }

        @Override
        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Insufficient funds");
            }
        }

        @Override
        public double getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        Account account = new Account(1313);
        System.out.println("Initial balance: " + account.getBalance());

        account.deposit(666);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(484);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        account.withdraw(1500);
    }
}
