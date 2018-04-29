package Chapter8Exercise13;

public class BankAccount
{
    String name;
    double balance = 0;
    double transactionsFee = 0;

    public BankAccount(String name)
    {
        this.name = name;
    }

    public void deposit(double amount)
    {
        this.balance = balance + amount;
    }

    public void withdraw(double amount)
    {
        if (balance - amount - transactionsFee > 0)
        {
            balance = balance - amount - transactionsFee;
        }
        if (balance - amount <= 0)
        {
            System.out.println("You can't withdraw, not enough money");
        }
        if (balance - (amount + transactionsFee) <= 0)
        {
        }
    }

    public void setTransactionsFee(double transactionsFee)
    {
        this.transactionsFee = transactionsFee;
    }

    public void transfer(BankAccount theAccount, double amount)
    {
        if (this.balance - amount - 5 > 0 && amount != 0)
        {
            this.balance = this.balance - amount - 5;
            theAccount.balance += amount;
        }

        if (this.balance - amount - 5 <= 0)
        {
            theAccount.balance += this.balance - 5;
            this.balance = 0;
        }

        if (this.balance < 5 || amount == 0)
        {
        }

        System.out.println(amount + " got transfered to " + theAccount.name);
        System.out.println(theAccount.name + " balance is now: " + theAccount.balance);
        System.out.println(this.name + " balance is now: " + this.balance + "\n");
    }

    @Override
    public String toString()
    {
        return this.name + ", " + "$"+ this.balance;
    }
}
