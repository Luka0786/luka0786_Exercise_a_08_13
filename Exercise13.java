package Chapter8Exercise13;

public class Exercise13
{
    /*
     There is a $5.00 fee for transferring money, so this much must be
     deducted from the current account’s balance before any transfer.
     The method should modify the two BankAccount objects such that “this” current
     object has its balance decreased by the given amount plus the $5 fee, and the
     other account's balance is increased by the given amount.

     If this account object does not have enough money to make the full transfer, transfer whatever money is
     left after the $5 fee is deducted.

     If this account has under $5 or the amount is 0
     or less, no transfer should occur and neither account's state should be modified.
    */

    public static void main(String[] args) {
        BankAccount bo = new BankAccount("Bo");
        bo.deposit(60.00);

        BankAccount marley = new BankAccount("Marley");
        marley.deposit(20.00);

        BankAccount marianne = new BankAccount("Marianne");
        marianne.deposit(40);

        BankAccount ringo = new BankAccount("Ringo");
        ringo.deposit(100);

        BankAccount michelle = new BankAccount("Michelle");
        michelle.deposit(30);

        BankAccount buller = new BankAccount("Buller");
        buller.deposit(70);

        bo.transfer(marley, 20);
        marianne.transfer(ringo, 0);
        michelle.transfer(buller, 30);
    }
}
