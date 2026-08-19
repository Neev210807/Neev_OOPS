public class bank {
    

    abstract static class Account {
        String name;
        double balance;

        Account(String name, double balance) {
            this.name = name;
            this.balance = balance;
        }

        abstract double interestRate();

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Balance: " + balance);
        }
    }

    static class SavingsAccount extends Account {

        SavingsAccount(String name, double balance) {
            super(name, balance);
        }

        @Override
        double interestRate() {
            return 4.0;
        }
    }

    static class CurrentAccount extends Account {

        CurrentAccount(String name, double balance) {
            super(name, balance);
        }

        @Override
        double interestRate() {
            return 2.0;
        }
    }

    static class FixedDepositAccount extends Account {

        FixedDepositAccount(String name, double balance) {
            super(name, balance);
        }

        @Override
        double interestRate() {
            return 7.5;
        }
    }

    public static void main(String[] args) {

        Account[] accounts = {
            new SavingsAccount("Savings", 10000),
            new CurrentAccount("Current", 15000),
            new FixedDepositAccount("Fixed Deposit", 20000)
        };

        for (Account account : accounts) {

            System.out.println(
                account.getClass().getSimpleName()
                + " Interest Rate = "
                + account.interestRate()
            );

            if (account instanceof SavingsAccount) {
                System.out.println("This is a Savings Account");
            }
            else if (account instanceof CurrentAccount) {
                System.out.println("This is a Current Account");
            }
            else if (account instanceof FixedDepositAccount) {
                System.out.println("This is a Fixed Deposit Account");
            }

            System.out.println();
        }
    }
}



